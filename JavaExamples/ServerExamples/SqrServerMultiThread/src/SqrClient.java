import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
 * Egyszerű CLI kliens a négyzetre emelő szerverhez.
 */
public class SqrClient {

    public static void main(String[] args) throws Exception {
        String serverAddress = "localhost";
        int serverPort = 9898;
        Socket socket = new Socket(serverAddress, serverPort);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        // beolvassa az első 3 sort, amit a szerver küld
        for (int i = 0; i < 3; i++) {
            System.out.println(in.readLine());
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number: ");
            String input = scanner.nextLine();              // parancssorról begépelt szöveg behozatala
            out.println(input);                             // elküldi a szöveget
            String answer = null;

            try {
                answer = in.readLine();                     // beolvassa a szervertől visszakapott szöveget

                if (answer == null || answer.equals("")) {  // ha az null, akkor kilép a végtelen ciklusból
                    break;
                }

                System.out.println(answer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
        socket.close();
    }

}
