class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++)
            max=Math.max(max,nums[i]);
        return (max*k) + (k*(k-1)/2);
    }
}


// 5   5+1    5+2   5+3
// 5   5+1