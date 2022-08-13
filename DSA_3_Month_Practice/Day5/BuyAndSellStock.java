package DSA_3_Month_Practice.Day5;

public class BuyAndSellStock {
    public static void main(String[] args) {

    }

    static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        int max = 0;

        for (int stockPrice : prices) {
            min = Math.min(min, stockPrice);
            profit = stockPrice - min;
            max = Math.max(profit, max);
        }

        return max;
    }

}
