class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            int c = (int)ch;
            res.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));
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