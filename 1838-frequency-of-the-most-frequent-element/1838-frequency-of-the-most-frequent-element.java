class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total=0;
        int l=0,r=0,res=0;
        while(r<nums.length){
            total+=nums[r];
            while(nums[r]*(r-l+1L) > total+k){
                total-=nums[l];
                l++;
            }
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}