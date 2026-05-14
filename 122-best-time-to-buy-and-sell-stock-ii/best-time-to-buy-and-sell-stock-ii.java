class Solution {
    public int maxProfit(int[] prices) {
        int maxpr = 0;
        for(int i = prices.length-1 ; i>0 ; i--){
            if(prices[i]-prices[i-1]>0) maxpr = maxpr + prices[i]-prices[i-1];
        }
        return maxpr;
    }
}