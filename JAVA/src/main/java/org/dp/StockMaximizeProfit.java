package org.dp;

public class StockMaximizeProfit {

    public static void main(String[] args) {
        int[] price = {1, 2, 1, 2/*, 4, 9*/};
        System.out.println(maxProfit(price));
        System.out.println(maxProfitOne(price));
        System.out.println(maxProfit3(price));
    }

    /**
     * Any no of transactions on a day
     *
     * @param price
     * @return
     */
    private static long maxProfit(int[] price) {
        long totalProfit = 0L;
        int maxSofar = 0;
        for (int i = price.length - 1; i >= 0; i--) {
            maxSofar = Math.max(price[i], maxSofar);
            totalProfit += (maxSofar - price[i]);
        }
        return totalProfit;
    }

    /**
     * At most 1 transaction a day [buy one and sell one share of the stock]
     *
     * @param price
     * @return
     */
    private static long maxProfitOne(int[] price) {
        if (price.length == 0) {
            return 0;
        }
        long result = 0L;
        int minimum = price[0];
        for (int i = 1; i < price.length; i++) {
            result = Math.max(result, price[i] - minimum);
            minimum = Math.min(minimum, price[i]);
        }
        return result;
    }

    /**
     * Say you have an array for which the ith element is the price of a given stock on day i.
     * <p>
     * Design an algorithm to find the maximum profit. You may complete at most two transactions.
     * <p>
     * Note:
     * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
     *
     * @param price
     * @return
     */
    private static int maxProfit3(int[] price) {
        int n = price.length;
        if (n == 0) {
            return 0;
        }
        int[] profit = new int[n];
        for (int i = 0; i < n; i++) {
            profit[i] = 0;
        }

        int max_price = price[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max_price = Math.max(max_price, price[i]);
            profit[i] = Math.max(profit[i + 1], max_price - price[i]);
        }

        int min_price = price[0];
        for (int i = 1; i < n; i++) {
            min_price = Math.min(min_price, price[i]);
            profit[i] = Math.max(profit[i - 1], profit[i] + (price[i] - min_price));
        }
        return profit[n - 1];
    }
}
