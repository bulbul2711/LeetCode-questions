class Solution {
    public int trap(int[] height) {
        int l=0, r=height.length-1, lmax=0, rmax=0, res=0;
        while(l<r){
            lmax=Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
            if(lmax<=rmax){
                res+=lmax-height[l];
                l+=1;
            }
            else{
                res+=rmax-height[r];
                r-=1;
            }
        }
        return res;
    }
}