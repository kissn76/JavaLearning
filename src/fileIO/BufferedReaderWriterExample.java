package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExample {

    public static void main(String[] args) throws IOException {
        String[] nevek = {"Béla", "Géza", "Éva", "Ádám", "Orsi"};
        File file = new File("nevek.txt");

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        for (String s : nevek) {
            writer.append(s);
            writer.newLine();
            writer.flush();
        }

        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }

        reader.close();
    }

}
