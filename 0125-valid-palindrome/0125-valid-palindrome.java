class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c>='a'&&c<='z' || c>='0'&&c<='9'){
                sb.append(c);
            }
        }
        s=sb.toString();
        //System.out.println(s);
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}