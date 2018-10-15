package rekurzio;
public class CoinCombination {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000, 20000};
        int totalAmount = 20;

        System.out.println("Kombinációk száma: " + combination(coins, totalAmount, 0, ""));
    }

    public static int combination(int[] coins, int amount, int currentIndex, String combination) {
        if (amount == 0) {
            System.out.println(combination);
            return 1;
        }

        if (amount < 0) {
            return 0;
        }

        int count = 0;
        for (int i = currentIndex; i < coins.length; i++) {
            count += combination(coins, amount - coins[i], i, combination + " " + coins[i]);
        }
        return count;
    }

}
