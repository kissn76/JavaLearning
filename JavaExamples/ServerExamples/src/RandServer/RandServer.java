import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * Ez talán a legegyszerűbb szerver megvalósítás Java-n. Egy TCP szervert indít
 * a megadott porton. Amint csatlakozik hozzá a kliens, elküld egy véletlen
 * számot, majd zárja a kapcsolatot. Egy időben egy klienst tud kiszolgálni.
 */
public class RandServer {

    public static void main(String[] args) throws IOException {
        System.out.println("Random number generator server is running!");
        ServerSocket listener = new ServerSocket(9090);     // a szerver figyel a 9090-es porton

        try {

            while (true) {
                Socket socket = listener.accept();          // kapcsolódik egy kliens, elkéri a Socket-et tőle

                try {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.println(new Random().nextInt());    // elküldi a kliensnek a véletlen számot
                } finally {
                    socket.close();                         // zárja a kapcsolatot
                }
            }
        } finally {
            listener.close();                               // a szerver leáll
        }
    }
}
