class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder res = new StringBuilder();
        for(char c: s.toCharArray()){
            String bit = Integer.toBinaryString(c);
            while(bit.length()<8){
                bit = "0" + bit;
            }
            res.append(bit);
        }
        int a = 0 , b = res.length()-1;
        while(a<b){
            if(res.charAt(a)!=res.charAt(b))return false;
            a++;
            b--;
        }
        return true;
    }
}