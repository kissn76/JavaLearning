package rekurzio;

public class LinearisKereses {

    public static void main(String[] args) {
        int[] sorozat = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int keresett = 4;

        System.out.println(keres(sorozat, 0, sorozat.length - 1, keresett));
    }

    public static int keres(int[] sorozat, int elsoIndex, int utolsoIndex, int keresett) {
        if (elsoIndex > utolsoIndex) {
            return 0;
        } else {
            if (sorozat[elsoIndex] == keresett) {
                return elsoIndex;
            } else {
                return keres(sorozat, elsoIndex + 1, utolsoIndex, keresett);
            }
        }
    }

}
