class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        double ans=1.0;
        long temp=n;
        if(n<0)
            temp*=-1;
        while(temp>0){
            if(temp%2==0){
                x=x*x;
                temp/=2;
            }
            else{
                ans=ans*x;
                temp--;
            }
        }
        if(n<0)
            return 1/ans;
        else
            return ans;
    }
}