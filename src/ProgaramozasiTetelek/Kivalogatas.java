/**
 * Kiválogatás tétele. A tömb bizonyos feltétel(ek)nek megfelelő elemeit egy
 * másik tömbbe másolom át.
 */
package tetelek;

import java.util.ArrayList;

public class Kivalogatas {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};

        ArrayList<Integer> tomb2 = new ArrayList<>();

        for (int elem : tomb) {
            if (elem % 2 == 0) {         // a kiválogatás feltétele, páros
                tomb2.add(elem);
            }
        }

        for (Integer elem : tomb2) {
            System.out.println(elem);
        }

        /**
         * Egy másik módszer, osztályok nélkül. A tomb3 vegén lehet egy pár(sok) null
         * elem is!
         */
        int[] tomb3 = new int[tomb.length];

        int db = 0;

        for (int elem : tomb) {
            if (elem % 2 == 0) {
                tomb3[db++] = elem;
            }
        }

        /**
         * Egy harmadik megoldás, szintén osztályok nélkül, de a céltömb csak olyan
         * méretü, amilyen szükséges. Ehhez kétszer kell átnézni a forrástömböt, először
         * a céltömb méretének meghatározása miatt.
         */

        int db2 = 0;

        for (int elem : tomb) {
            if (elem % 2 == 0) {
                db2++;
            }
        }

        int[] tomb4 = new int[db2];
        db2 = 0;
        for (int elem : tomb) {
            if (elem % 2 == 0) {
                tomb4[db2++] = elem;
            }
        }
    }

}
