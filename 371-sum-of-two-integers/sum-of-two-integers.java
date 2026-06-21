class Solution {
    public int getSum(int a, int b) {
        int sum = a^b;
        int carry = (a&b)<<1;
        while(carry!=0){
            int newsum = sum^carry;
            int newcarry = (sum&carry)<<1;
            sum = newsum;
            carry = newcarry;
        }
        return sum;
    }
}