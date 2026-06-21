class Solution {
    public int[] countBits(int n) {
        int offset = 1;
        int []res = new int[n+1];
        res[0] = 0;
        for(int i = 1 ; i<=n ; i++){
            if(offset *2 == i){
                offset = i;
            }
            res[i] = 1 + res[i-offset];
        }
        return res;
    }
}