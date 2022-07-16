/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 15-03-2022
Time: 12:12
File: BuyAndSellStocks.java */
package dynamicprogramming;

public class BuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0) return 0;

        int[] left = new int[n];
        int[] right = new int[n];

        int min = prices[0];

        for (int i = 1; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            int profit1 = prices[i] - min;
            left[i] = Math.max(left[i+1], profit1);
        }
        int max = prices[n-1];
        for (int i = n-2; i >= 0; i--) {
            if (prices[i] > max) {
                max = prices[i];
            }
            int profit2 = max - prices[i];
            right[i] = Math.max(right[i-1], profit2);
        }

        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            int profitFine = left[i] + right[i];
            maxProfit = Math.max(maxProfit, profitFine);
        }
        return maxProfit;
    }
}