/**
 * Megszámolás tétele. A tömb azon elemeinek száma, amelyek megfelelnek bizonyos
 * feltétel(ek)nek.
 */
package tetelek;

public class Megszamolas {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};

        int szamlalo = 0;

        for (int elem : tomb) {
            if (elem > 5) {
                szamlalo++;
            }
        }

        System.out.println(szamlalo);
    }

}
