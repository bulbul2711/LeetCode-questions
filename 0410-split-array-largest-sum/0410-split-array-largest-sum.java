class Solution {
    public int splitArray(int[] nums, int k) {
        int l=Integer.MIN_VALUE;
        int r=0;
        for(int i=0;i<nums.length;i++){
            l=Math.max(l,nums[i]);
            r+=nums[i];
        }
        while(l<r){
            int m=l+(r-l)/2;
            if(feasible(m,nums,k))
                r=m;
            else
                l=m+1;
        }
        return l;
    }
    public boolean feasible(int m,int[] nums,int k){
        int total=0,parts=1;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(total>m){
                total=nums[i];
                parts++;
                if(parts>k)
                    return false;
            }
        }
        return true;
    }
}