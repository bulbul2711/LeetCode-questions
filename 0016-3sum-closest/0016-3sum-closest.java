class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=Integer.MAX_VALUE,sum=0;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                sum=nums[i]+nums[l]+nums[r];
                if(Math.abs(sum-target)<Math.abs(res-target)){
                    res=sum;
                }
                if(sum==target)
                    return sum;
                else if(sum<target){
                    l++;
                }
                else if(sum>target){
                    r--;
                }
            }
        }
        return res;
    }
}