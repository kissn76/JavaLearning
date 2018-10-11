/**
 * Maximum kiválasztás
 */
package ProgramozasiTetelek;

public class Maximum {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};

        int max = tomb[0];

        for (int i : tomb) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);

    }

}
