/**
 * Rendezés cserével
 * https://www.youtube.com/watch?v=Ns4TPTC8whw
 */
package ProgramozasiTetelek.Rendezes;

public class CseresRendezes {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};
        int osszehasonlitasokSzama = 0;

        for (int i = 0; i < tomb.length; i++) {
            for (int j = i + 1; j < tomb.length; j++) {
                if (tomb[i] > tomb[j]) {
                    int a = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = a;
                }
                osszehasonlitasokSzama++;
            }
        }

        for (int i : tomb) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + osszehasonlitasokSzama);
    }

}
