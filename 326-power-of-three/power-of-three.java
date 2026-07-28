class Solution {
    public boolean isPowerOfThree(int n) {
        int maxpow = 1;
        while(maxpow<= Integer.MAX_VALUE / 3){
            maxpow *= 3; 
        }
        return n>0 && maxpow%n ==0;
    }
}