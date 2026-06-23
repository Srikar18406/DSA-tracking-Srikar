class Solution {
    public String removeDuplicates(String s) {
        char []stack = new char[s.length()];
        int top = 0;
        for(int i = 0 ; i< s.length(); i++){
            char ch = s.charAt(i);
            if(top>0 && stack[top-1]==ch){
                top--;
            }
            else{
                stack[top] = ch;
                top++;
            }
        }
        return new String(stack , 0 , top);
    }
}