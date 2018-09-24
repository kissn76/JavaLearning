/**
 * Összegzés tétele. Egy tömb összes elemének összeadása.
 */
package ProgramozasiTetelek;

public class Osszegzes {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};

        int osszeg = 0;

        for (int elem : tomb) {    // for (int i = 0; i < tomb.length; i++) {
            osszeg += elem;        // osszeg = osszeg + tomb[i];
        }

        System.out.println(osszeg);
    }

}
