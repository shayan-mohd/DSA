package Arrays;

public class Best_Time_to_Buy_and_Sell_Stock_II_122 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];

        for (int i = 1; i< prices.length; i++) {
            if (prices[i] - buy > 0) {
                maxProfit += prices[i] - buy;
            }
            buy = prices[i];
        }
        return maxProfit;
    }
}
