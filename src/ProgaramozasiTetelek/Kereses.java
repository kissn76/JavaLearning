/**
 * Keresés tétele. Adott elem hányadik helyen szerepel a tömbben, ha szerepel
 * benne?
 */
package tetelek;

public class Kereses {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};
        int keresettSzam = 13;

        int i = 0;
        while (i < tomb.length && tomb[i] != keresettSzam) {
            i++;
        }

        if (i < tomb.length) {
            System.out.println(keresettSzam + " megtalálható a tömbben! Indexe: " + i);
        } else {
            System.out.println(keresettSzam + " nincs benne a tömbben!");
        }
    }

}
