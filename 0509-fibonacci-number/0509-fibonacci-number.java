class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        return fibo(n,dp);
    }
    int fibo(int n,int[] dp){
        if(n<=1) return n;
        else if(dp[n]!=0) return dp[n];
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
       // return dp[n];
    }
}