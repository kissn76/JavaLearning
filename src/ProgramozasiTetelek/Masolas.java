/**
 * Egy tömb elemeit átmásolom egy másik tömbbe, miközben valamilyen átalakítást végzek az egyes elemeken.
 */
package ProgramozasiTetelek;

public class Masolas {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};
        int[] tomb2 = new int[tomb.length];

        for (int i = 0; i < tomb.length; i++) {
            tomb2[i] = tomb[i] * 2;
        }

        for (int i : tomb2) {
            System.out.println(i);
        }
    }

}
