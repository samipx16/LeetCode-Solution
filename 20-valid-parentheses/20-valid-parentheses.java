class Solution {
    public boolean isValid(String s) {
       if(s.length()%2 !=0) return false;
        Stack<Character> braces = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                braces.push(c);
                
            }
            else if(c == ')' && !braces.isEmpty() && braces.peek()=='(') {
              braces.pop();  
            }
            else if(c == '}' && !braces.isEmpty() && braces.peek()=='{') {
              braces.pop();  
            }
            else if(c == ']' && !braces.isEmpty() && braces.peek()=='[') {
              braces.pop();  
            }
            else braces.push(c);
        }
        return braces.isEmpty();
    }
}
