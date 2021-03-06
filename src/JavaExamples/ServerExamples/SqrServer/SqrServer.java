package JavaExamples.ServerExamples.SqrServer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Egy egyszerű szerver, amely a klienstől kapott szám négyzetét küldi vissza.
 * Egyszerre egy klienst tud kiszolgálni.
 */
public class SqrServer {

    public static void main(String[] args) throws Exception {
        System.out.println("The square server is running!");
        ServerSocket listener = new ServerSocket(9898);

        try {

            while (true) {
                Socket socket = listener.accept();

                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                    // elküld 3 sor szöveget a kliensnek
                    out.println("Enter a number to square!");
                    out.println("To quit Enter an empty line!");
                    out.println("");

                    while (true) {
                        String input = in.readLine();               // beolvassa a kliens által küldött szöveget
                        String answer = null;

                        try {
                            float inputNumber = Float.parseFloat(input);        // szövegből szám
                            answer = Float.toString(inputNumber * inputNumber); // szorzatból szöveg
                        } catch (NumberFormatException e) {
                            answer = "Enter a number!";
                        }

                        if (input == null || input.equals("")) {    // ha a szöveg null vagy üres akkor megszakítja a kapcsolatot
                            break;
                        }

                        out.println(answer);                        // visszaküldi a kliensnek a kapott szám négyzetét
                    }
                } finally {
                    socket.close();
                }
            }
        } finally {
            listener.close();
        }
    }

}
