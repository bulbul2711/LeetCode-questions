class Solution {
    public int mySqrt(int x) {
        if(x==1 || x==0) return x;
   int low=1,high=x,ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid==x/mid){
                ans= mid;
                break;
            }
            else if(mid<x/mid){
                low=mid+1;
                ans=mid;
            }
            else
                high=mid-1;
        }
        return ans;
    }
}