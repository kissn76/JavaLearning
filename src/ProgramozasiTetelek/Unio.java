/**
 * Két tömb minden elemét átmásoljuk egy harmadik tömbbe. Duplikált elemek ne legyenek, tehát, ha egy elem mindkét tömbben szerepelt, akkor a
 * harmadikban csak egyszer legyen benne.
 */
package ProgramozasiTetelek;

import java.util.ArrayList;

public class Unio {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};
        int[] tomb2 = {15, 2, 5, 12, 13, 11, 26, 8, 57, 110};
        ArrayList<Integer> unio = new ArrayList<>();

        for (int i : tomb) {
            unio.add(i);
        }

        for (int i : tomb2) {
            if (!unio.contains(i)) {
                unio.add(i);
            }
        }

        for (int i : unio) {
            System.out.println(i);
        }

    }

}
