class Solution {
    public String removeStars(String s) {
        char []stack = new char[s.length()];
        int top = -1;
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i)!='*'){
                stack[++top] = s.charAt(i);
            }
            else{
                stack[top] = '\0';
                top--;
            }
        }
        return new String(stack , 0 , top+1);
    }
}