package ProgramozasiTetelek.Rendezes;

public class BeszurasosRendezes {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};
        int osszehasonlitasokSzama = 0;

        for (int i = 1; i < tomb.length; i++) {
            int kulcs = tomb[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (tomb[j] > kulcs) {
                    tomb[j + 1] = tomb[j];
                } else {
                    break;
                }
                osszehasonlitasokSzama++;
            }
            tomb[j + 1] = kulcs;
        }

        for (int i : tomb) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + osszehasonlitasokSzama);

    }

}
