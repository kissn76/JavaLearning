/**
 * Egy tömb elemeit két tömbbe válogatjuk szét megadott szabály alapján.
 */
package ProgramozasiTetelek;

import java.util.ArrayList;

public class Szetvalogatas {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};

        ArrayList<Integer> paros = new ArrayList<>();
        ArrayList<Integer> paratlan = new ArrayList<>();

        for (int element : tomb) {
            if (element % 2 == 0) {
                paros.add(element);
            } else {
                paratlan.add(element);
            }
        }

        System.out.print("Páros elemek:");
        for (int element : paros) {
            System.out.print(element + " ");
        }

        System.out.print("\n" + "Páratlan elemek:");
        for (int element : paratlan) {
            System.out.print(element + " ");
        }

    }

}
