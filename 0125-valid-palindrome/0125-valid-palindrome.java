class Solution {
    //Recursion
    public boolean findPalindrome(String s,int i,int j){
        if(i>j) return true;
        else if(s.charAt(i)!=s.charAt(j)) return false;
        return findPalindrome(s,i+1,j-1);
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c :  s.toCharArray()){
            if(c>='a' && c<='z' || c>='0' && c<='9'){
                sb.append(c);
            }
        }
        //System.out.println(sb.toString());
        //return true;
        return findPalindrome(sb.toString(),0,sb.toString().length()-1);
    }
}