class Solution {
    public int maxProfit(int[] prices) {
        int minp = Integer.MAX_VALUE;
        int maxpr = 0;
        for(int p : prices){
            if(p<minp){
                minp = p;
            }
            else if(p-minp>maxpr){
                maxpr = p - minp;
            }
        }
        return maxpr;
    }
}