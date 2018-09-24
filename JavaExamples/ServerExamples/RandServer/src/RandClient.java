import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Egyszerű CLI kliens a dátumszerverhez.
 */
public class RandClient {

    public static void main(String[] args) throws IOException {
        String serverAddress = "localhost";
        int serverPort = 9898;
        Socket socket = new Socket(serverAddress, serverPort);  // kapcsolódik a szerverhez a megadott porton
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String answer = input.readLine();                       // veszi a szerver üzenetét
        System.out.println(answer);                             // és kiírja standard output-ra
        socket.close();                                         // lezárja a kapcsolatot
    }
}
