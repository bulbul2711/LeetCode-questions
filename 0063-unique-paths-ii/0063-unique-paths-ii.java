class Solution {
    public int uniquePathsWithObstacles(int[][] dp) {
        int m=dp.length;
        int n=dp[0].length;
         if(dp[m-1][n-1]==1)
             return 0;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1)      
                    dp[i][j]=1;  //if we write this condition outside                                           loop then the next condition in loop                                             (just after this one) will be true.and                                           answer will never come.
                else if(dp[i][j]==1)
                    dp[i][j]=0;
                else if(i==m-1)
                    dp[i][j]=dp[i][j+1];
                else if(j==n-1)
                     dp[i][j]=dp[i+1][j];
                else
                    dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}