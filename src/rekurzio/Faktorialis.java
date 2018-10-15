package rekurzio;

import java.math.BigInteger;

/**
 * A 0. faktoriális 1, a többi az előző faktoriális a vizsgált szám szorzata.
 * 
 * @author nn
 */
public class Faktorialis {

    public static void main(String[] args) {
        int szam = 100;

        for (int i = 0; i <= szam; i++) {
            System.out.println(i + ": " + faktor(i));
        }
    }

    // public static int faktor(int szam) {
    public static BigInteger faktor(int szam) {
        if (szam == 0) {
            // return 1;
            return new BigInteger("1");
        }

        // return szam * faktor(szam - 1);
        return new BigInteger(String.valueOf(szam)).multiply(faktor(szam - 1));
    }

}
