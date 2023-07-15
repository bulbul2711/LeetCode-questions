class Solution {
    public int fib(int n) {
        /* MEMOIZATION */
    //     int dp[]=new int[n+1];
    //     return fibo(n,dp);
    // }
    // int fibo(int n,int[] dp){
    //     if(n<=1) return n;
    //     else if(dp[n]!=0) return dp[n];
    //     dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    //     return dp[n];
        
        /* TABULATION */
        if(n==0) return 0;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n+1;i++)
            dp[i]=dp[i-1]+dp[i-2];
        return dp[n];
    }
}