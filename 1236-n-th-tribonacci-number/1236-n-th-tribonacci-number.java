class Solution {
    public int result(int n,int[] dp){
        if(n<=2){
            return dp[n];
        }
        if(dp[n]!=0){
            return dp[n];
        }
       return dp[n]=result(n-1,dp)+result(n-2,dp)+result(n-3,dp);
    }
    public int tribonacci(int n) {
        if(n<=2){
            if(n<2)
                return n;
            else
                return 1;
        }
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=dp[2]=1;
        return result(n,dp);
    }
}