class Solution {
    public int maxProfit(int[] prices) {
        // Base case: If we don't have at least 2 prices, we can't buy and sell
        if (prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0]; // Track the lowest buying price seen so far
        int maxProfit = 0;        // Track the best profit seen so far

        for (int i = 0; i < prices.length; i++) {
            // Update minPrice if we find a cheaper day to buy
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Calculate profit if we sell today, and update maxProfit if it's better
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}