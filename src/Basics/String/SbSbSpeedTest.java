package Basics.String;

public class SbSbSpeedTest {

    public static void main(String[] args) {
        // StringBuffer vs StringBuilder sebességteszt, a kisebb a gyorsabb
        int N = 77777777;
        long t;

        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i-- > 0;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i > 0; i--) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
    }

}
