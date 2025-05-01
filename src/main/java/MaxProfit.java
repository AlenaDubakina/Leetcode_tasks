import java.util.Arrays;

public class MaxProfit {
    /*
    Вам дан массив, prices, где prices[i]— цена определенной акции на день.
    Bы хотите максимизировать свою прибыль, выбрав один день для покупки одних акций
    и другой день в будущем для продажи этих акций.
    Верните максимальную прибыль, которую вы можете получить от этой транзакции.
    Если вы не можете получить никакой прибыли, верните 0.
     */

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > profit) {
                profit = prices[i] - minPrice;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2};
        System.out.println(maxProfit(prices));
    }
}