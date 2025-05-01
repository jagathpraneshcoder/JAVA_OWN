class Solution {
    public boolean isValid(String S) {
        Stack<Character> s = new Stack<>();
        for(char c : S.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                s.push(c);
                System.out.println("entyry");
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                char top = s.pop();
                if(c==')' && top != '('){
                    return false;
                }
                if(c=='}' && top != '{'){
                    return false;
                }
                if(c==']' && top != '['){
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}