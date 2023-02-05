class Solution {
    public int[] numberOfPairs(int[] nums) {
       int res[]=new int[2];int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j] &&                               nums[j]!=-1)
                {   c++; 
                // nums[i]=-1;
                 nums[j]=-1;
                    break;
                }
            }
           
        }
        res[0]=c;
        res[1]=nums.length-(2*c);
        return res;
}
}