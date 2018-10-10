/**
 * https://www.webotlet.hu/?p=627
 * http://java2.uw.hu/09_io_muveletek.html#5
 * http://java.progtanulo.hu/2031-a-kozvetlen-eleresu-allomanyok-hasznalata
 */
package fileIO;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

    public static void main(String[] args) {
        RandomAccessFile raf;

        // Fájl létrehozása
        try {
            String[] nevek = {"Béla", "Géza", "Éva", "Ádám", "Orsi"};
            raf = new RandomAccessFile("nevek.txt", "rw");

            for (String s : nevek) {
                raf.writeUTF(s);
            }

            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Fájl olvasása
        try {
            raf = new RandomAccessFile("nevek.txt", "r");

            try {
                String sor;
                while ((sor = raf.readUTF()) != null) {
                    System.out.println(sor);
                }
            } catch (EOFException e) {
                return;
            }

            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Meglévő fájl végéhez hozzáfűzés
        // Sor beszúrása fájlba (nem a végére)
        // Adott sor kicserélése
    }

}
