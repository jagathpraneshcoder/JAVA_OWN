class Solution {
    public int countHomogenous(String s) {
        long sum = 0;
        int count = 1;
        int i = 1;
        int MOD = 1_000_000_007;
        if(s.length() == 1){
            return 1;
        }
        while(i < s.length()){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                sum = ( sum + (long)count*(count+1)/2 ) % MOD;
                count = 1;
            }
            i++;
        }
        sum = ( sum + (long)count*(count+1)/2 ) % MOD;
        return (int) sum;
    }
}