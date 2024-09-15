package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Best_Time_to_Buy_and_Sell_III_123 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        return calculateProfit(prices, false, maxProfit, 0, 0);
    }


    // NOT AN OPTIMAL SOLUTION
    public int calculateProfit(int[] prices, boolean canSell, int maxProfit, int i, int limit) {

        if (i == prices.length || limit == 2)
            return maxProfit;

        if (canSell) {
            return Math.max(calculateProfit(prices, false, maxProfit + prices[i], i+1, limit + 1),
                    calculateProfit(prices, true, maxProfit, i+1, limit));
        }
        else {
            return Math.max(calculateProfit(prices, true, maxProfit - prices[i], i+1, limit),
                    calculateProfit(prices, false, maxProfit, i+1, limit));
        }
    }


}
