class Solution {
    public void reverseString(char[] s) {
        char[] stack = new char[s.length];
        int top = -1;
        for(int i = 0 ; i<s.length ; i++){
            top++;
            stack[top] = s[i];
        }
        for(int j = 0 ; j<s.length;j++){
            s[j] = stack[top--];
        }
        }
}