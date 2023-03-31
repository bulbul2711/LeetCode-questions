class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int ls[]=new int[nums.length];
        int rs[]=new int[nums.length];
        int ans[]=new int[nums.length];
        ls[0]=0;rs[nums.length-1]=0;
        int lsum=0,rsum=0;
        for(int i=1;i<nums.length;i++){
            lsum+=nums[i-1];
            ls[i]=lsum;
        }
        for(int i=nums.length-2;i>=0;i--){
            rsum+=nums[i+1];
            rs[i]=rsum;
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(ls[i]-rs[i]);
        }
        return ans;
    }
}