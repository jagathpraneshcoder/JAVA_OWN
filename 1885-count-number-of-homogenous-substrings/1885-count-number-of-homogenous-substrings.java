class Solution {
    public int countHomogenous(String s) {
        long sum = 0;
        int count = 1;
        int i = 0;
        int MOD = 1_000_000_007;
        while(i < s.length()){
            while( i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            sum = (sum + (long)count*(count+1)/2)%MOD ;
            count=1;
            i++;
        }
        return (int)sum;
    }
}