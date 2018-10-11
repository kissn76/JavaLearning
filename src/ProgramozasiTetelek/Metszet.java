/**
 * Két tömb azonos elemeit átmásoljuk egy harmadik tömbbe.
 */
package ProgramozasiTetelek;

import java.util.ArrayList;

public class Metszet {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};
        int[] tomb2 = {15, 2, 5, 12, 13, 11, 26, 8, 57, 110};
        ArrayList<Integer> metszet = new ArrayList<>();

        for (int i : tomb) {
            int s = 0;
            while (s < tomb2.length && i != tomb2[s]) {
                s++;
            }
            if (i == tomb2[s]) {
                metszet.add(tomb2[s]);
            }
        }

        for (int i : metszet) {
            System.out.println(i);
        }

    }

}
