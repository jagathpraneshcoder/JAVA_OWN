class Solution {

    public static int solve(int m,int n,int[][] dp){
        dp[0][0] = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 if(i==0 || j==0)
                    dp[i][j]=1;
                else if(i!=0 && j!=0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];
        
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 0;
        int result = solve(m,n,dp);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
            return result;
        }
}