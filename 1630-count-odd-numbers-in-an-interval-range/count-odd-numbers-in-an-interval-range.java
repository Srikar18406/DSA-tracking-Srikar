class Solution {
    public int countOdds(int low, int high) {
        if(low%2==0) low = low+1;
        int c = 0;
        for(int i = low ; i<=high ; i = i+2){
            c++;
        }
        return c;
    }
}