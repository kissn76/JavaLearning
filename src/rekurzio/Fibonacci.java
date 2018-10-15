package rekurzio;

/**
 * A nulladik eleme 0, az első eleme 1, a további elemeket az előző kettő elem összegeként kapjuk.
 * 
 * @author nn
 */
public class Fibonacci {

    public static void main(String[] args) {
        int tag = 10;

        for (int i = 0; i <= tag; i++) {
            System.out.println("A Fibonacci sorozat " + i + ". tagja:" + Fibonacci(i));
        }
    }

    static long Fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
