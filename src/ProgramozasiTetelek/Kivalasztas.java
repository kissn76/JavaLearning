/**
 * Kiválasztás tétele. Egy adott érték hányadik helyen szerepel a tömbben? A
 * keresett érték biztosan a tömb eleme, ezért ezt nem vizsgáljuk.
 */
package ProgramozasiTetelek;

public class Kivalasztas {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};
        int keresettSzam = 9;

        int i = 0;
        while (tomb[i] != keresettSzam) {
            i++;
        }

        System.out.println(keresettSzam + " indexe a tömbben: " + i);
    }

}
