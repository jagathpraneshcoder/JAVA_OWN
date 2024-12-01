class Solution {

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
        return sb.toString().equals(sb.reverse().toString());
    }
}