class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[] ans = new int[]{0,0};
        for(int i =0 ;i<n;i++){
            
            int oddLength = expand(i,i,s);
            int evenLength = expand(i,i+1,s);
            if(oddLength > ans[1]-ans[0]+1){
                int index = oddLength / 2;
                ans[0] = i - index;
                ans[1] = i + index ;
            }
            if(evenLength > ans[1]-ans[0]+1){
                int index = (evenLength / 2) - 1;
                ans[0] = i - index;
                ans[1] = i + index + 1;
            }
            
        }
        return s.substring(ans[0],ans[1]+1);
    }
    public int expand(int i,int j,String s){
        while(i>=0 && j < s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j - i - 1;
    }
}