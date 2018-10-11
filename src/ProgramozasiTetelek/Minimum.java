/**
 * Minimum kiválasztás
 */
package ProgramozasiTetelek;

public class Minimum {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};

        int min = tomb[0];

        for (int i : tomb) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println(min);
    }

}
