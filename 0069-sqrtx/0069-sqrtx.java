class Solution {
    public int mySqrt(int x) {
       //both are working properly
        
        //binary search
        // int low=1,high=x,ans=0;
        // while(low<=high){
        //     int mid=low+(high-low)/2;
        //     if(mid==x/mid){
        //         ans= mid;
        //         break;
        //     }
        //     else if(mid<x/mid){
        //         low=mid+1;
        //         ans=mid;
        //     }
        //     else
        //         high=mid-1;
        // }
        // return ans;
        
        //Template
         int l=1,r=x;
            if(x==0 || x==1)
                return x;
            while(l<r){
                int mid=l+(r-l)/2;
                if(mid<=x/mid)
                   l=mid+1;
                else
                    r=mid; 
            }
            return l-1;

        
    }
}