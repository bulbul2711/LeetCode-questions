class Solution {
    public int splitArray(int[] nums, int k) {
        int l=nums[0],r=0;
        for(int i=0;i<nums.length;i++)
            l=Math.max(l,nums[i]);
         for(int i=0;i<nums.length;i++)
             r+=nums[i];
        while(l<r){
            int mid=l+(r-l)/2;
            if(feasible(mid,nums,k))
                r=mid;
            else
                l=mid+1;
        }
        return l;
    }
    
    boolean feasible(int mid,int[] nums,int k){
        int total=0,part=1;
         for(int i=0;i<nums.length;i++){
             total+=nums[i];
             if(total>mid){
                 total=nums[i];
                 part+=1;
                 if(part>k)
                     return false;
             }
                 
         }
        return true;
    }
}