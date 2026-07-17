class Solution {
    public boolean backspaceCompare(String s, String t) {
        return applyStack(s).equals(applyStack(t));
    }
    public String applyStack(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch!='#'){
                stack.push(ch);
            }
            else if(!stack.empty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}