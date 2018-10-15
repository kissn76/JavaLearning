package rekurzio;

public class Ackermann {

    public static void main(String[] args) {
        int m = 2;
        int n = 2;

        System.out.println(ack(m, n));
    }

    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0) {
            if (n == 0) {
                return ack(m - 1, 1);
            } else if (n > 0) {
                return ack(m - 1, ack(m, n - 1));
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

}
