class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        // int i=0;
        // while(i<nums.length)
        // {
        //     int j=i+1;
        //     while(j<nums.length){
        //         max=Math.max(max,(nums[i]-1)*(nums[j]-1));
        //         j++;
        //     }
        //     i++;
        // }
        for(int i=0;i<nums.length;i++)
             for(int j=i+1;j<nums.length;j++)
                  max=Math.max(max,(nums[i]-1)*(nums[j]-1));
        return max;
    }
}