package hello;

public class RandomTest {

    public static void main(String[] args) {
        int max = 90;
        int min = 80;
        int count = 1000000;
        int[] numArray = new int[max + 1];

        for (int i = 0; i < count; i++) {
            int num = getRandomNumber(min, max);
            numArray[num]++;
        }

        for (int i = 0; i < numArray.length; i++) {
            System.out.println(i + ": " + numArray[i]);
        }
    }

    public static int getRandomNumber(int min, int max) {
        int random = min + (int) (Math.random() * ((max - min) + 1));
        return random;
    }

}
