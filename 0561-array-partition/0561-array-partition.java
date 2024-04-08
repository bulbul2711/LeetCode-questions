class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-2;
        int sum=0;
        while(i>=0){
            sum+=nums[i];
            i-=2;
        }
        return sum;
    }
}
