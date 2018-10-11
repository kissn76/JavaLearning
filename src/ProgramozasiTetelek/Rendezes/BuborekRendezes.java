/**
 * Feltételezzük, hogy az n a tömb elemeinek száma.
 * A sorozat két első elemét összehasonlítjuk, és ha fordított sorrendben vannak felcseréljük. Utána a másodikat és a harmadikat hasonlítom össze.
 * Ha a nagyobb számokat a végén szeretném látni, akkor az első körben a legnagyobb szám tulajdonképpen a sor végére kerül. Ezért a következő körben
 * azzal már nem foglalkozunk, ezért megyünk mindig a belső ciklusban csak i változó értékéig. A külső ciklus így megmutatja meddig kell mennünk.
 */
package ProgramozasiTetelek.Rendezes;

public class BuborekRendezes {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};

        for (int i = 0; i < tomb.length - 1; i++) {
            if (tomb[i] > tomb[i + 1]) {
                int a = tomb[i];
                int b = tomb[i + 1];
                tomb[i] = b;
                tomb[i + 1] = a;
                i = 0;
            }
        }

        for (int i : tomb) {
            System.out.print(i + " ");
        }

    }

}
