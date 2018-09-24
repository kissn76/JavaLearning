/**
 * Eldöntés tétele. Egy érték megtalálható-e a tömbben.
 */
package tetelek;

public class Eldontes {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};
        int keresettSzam = 10;

        int i = 0;
        while (i < tomb.length && tomb[i] != keresettSzam) {
            i++;
        }

        if (i < tomb.length) {
            System.out.println(keresettSzam + " megtalálható a tömbben!");
        } else {
            System.out.println(keresettSzam + " nincs benne a tömbben!");
        }
    }

}
