package rekurzio;

public class BinomalisEgyutthatok {

    public static void main(String[] args) {
        int n = 4;
        int k = 2;

        System.out.println(bin(n, k));
    }

    public static int bin(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k > 0 && k < n) {
            return bin(n - 1, k) + bin(n - 1, k - 1);
        } else {
            System.out.println("Hibás szám!");
        }

        return 0;
    }

}

/**
 *                      (1)   (1)
 *                     1,1 + 1,0
 *            (1)   (2)/
 *           2,2 + 2,1
 *  (6)   (3)/  (3)
 * 4,2 – 3,2 + 3,1
 *                \ (2)   (1)
 *                 2,1 + 2,0
 *                    \ (1)   (1)
 *                     1,1 + 1,0
 */