package rekurzio;

public class LogaritmikusKereses {

    public static void main(String[] args) {
        int[] sorozat = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};    // rendezett növekvőben
        int keresett = 4;

        System.out.println(keres(sorozat, 0, sorozat.length - 1, keresett));
    }

    public static int keres(int[] sorozat, int elsoIndex, int utolsoIndex, int keresett) {
        if (elsoIndex > utolsoIndex) {
            return 0;
        } else {
            int k = (elsoIndex + utolsoIndex) / 2;
            // System.out.println(k + ": " + sorozat[k]);

            if (sorozat[k] == keresett) {
                return k;
            } else if (sorozat[k] < keresett) {
                return keres(sorozat, k + 1, utolsoIndex, keresett);
            } else {
                return keres(sorozat, elsoIndex, k - 1, keresett);
            }
        }
    }

}
