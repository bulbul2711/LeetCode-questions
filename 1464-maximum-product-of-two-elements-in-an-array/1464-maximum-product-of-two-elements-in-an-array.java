class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int i=0;
        while(i<nums.length)
        {
            int j=i+1;
            while(j<nums.length){
                max=Math.max(max,(nums[i]-1)*(nums[j]-1));
                j++;
            }
            i++;
        }
        return max;
    }
}