/**
 * Feltételezzük, hogy az n a tömb elemeinek száma.
 * A sorozat két első elemét összehasonlítjuk, és ha fordított sorrendben vannak felcseréljük. Utána
 * a másodikat és a harmadikat hasonlítom össze.
 * Ha a nagyobb számokat a végén szeretném látni, akkor az első körben a legnagyobb szám
 * tulajdonképpen a sor végére kerül. Ezért a következő körben
 * azzal már nem foglalkozunk, ezért megyünk mindig a belső ciklusban csak i változó értékéig. A
 * külső ciklus így megmutatja meddig kell mennünk.
 */
package ProgramozasiTetelek.Rendezes;

public class BuborekRendezes {

    public static void main(String[] args) {
        int[] tomb = {9, 4, 5, 2, 3, 1, 6, 8, 7, 10};
        int osszehasonlitasokSzama = 0;

        for (int i = tomb.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tomb[j] > tomb[j + 1]) {
                    int a = tomb[j + 1];
                    tomb[j + 1] = tomb[j];
                    tomb[j] = a;
                }
                osszehasonlitasokSzama++;
            }
        }

        for (int i : tomb) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + osszehasonlitasokSzama);
    }

}
