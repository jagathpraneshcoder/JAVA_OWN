class Solution {
    public int maxDepth(String s) {
        int max_count = 0;
        int depth = 0;
        for(char c : s.toCharArray()){
            max_count = Math.max(depth,max_count);
            if(c=='('){
                depth+=1;
            }
            else if(c==')'){
                depth-=1;
            }
        }
        return max_count;
    }
}