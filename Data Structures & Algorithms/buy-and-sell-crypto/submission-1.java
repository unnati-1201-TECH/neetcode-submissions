class Solution {
    public int maxProfit(int[] prices) {
        int minPriceSoFar = Integer.MAX_VALUE;
        int profitMax = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++){
            minPriceSoFar = Math.min(minPriceSoFar, prices[i]);
            profitMax = Math.max(profitMax, prices[i] - minPriceSoFar);
        }

        return profitMax;
    }
}
