class Solution {
    public int fib(int n) {
       // if(n==0)
       //      return 0;
       //  if(n==1)
       //      return 1;
       //  return fib(n-1)+fib(n-2);
     
 /*  =========recusive = 10ms , iterative = 0ms=============   */  
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0,b=1,c=0;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
       return c;  
    }
}