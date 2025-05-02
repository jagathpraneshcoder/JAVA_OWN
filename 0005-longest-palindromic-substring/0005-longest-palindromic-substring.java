class Solution {

    public boolean isPalindrome(int start,int end,String s){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String answer = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(i,j,s)){
                    String buffer = s.substring(i,j+1);
                    //System.out.println(buffer);
                    if(buffer.length() > answer.length()){
                        answer = buffer;
                    }
                }
            }
        }
        return answer;
    }
}