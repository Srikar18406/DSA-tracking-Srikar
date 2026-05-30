class Solution {
    public boolean isHappy(int n) {
        Set <Integer> set = new HashSet<>();
        while(n!=1){
            if(set.contains(n)) return false;
            set.add(n);
            n = nextNum(n);
        }
        return true;
    }
    public int nextNum(int n){
        int sum = 0;
        while(n>0){
            int d = n%10;
            sum += d*d;
            n = n/10;
        }
        return sum;
    }
}