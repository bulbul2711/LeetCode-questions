class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
   long low=1,high=x,ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid==x){
                ans= mid;
                break;
            }
            else if(mid*mid<x){
                low=mid+1;
                ans=mid;
            }
            else
                high=mid-1;
        }
        return (int)ans;
    }
}