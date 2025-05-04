class Solution {
    public int minAddToMakeValid(String s) {
        int i = 0;
        int open = 0;
        int close = 0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                open++;
            }
            else if(s.charAt(i)==')' && open > 0){
                open--;
            }
            else{
                close++;
            }
            i++;
        }
        if(open>0){
            return open+close;
        }
        else{
            return close;
        }
    }
}