class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[]=new int[nums.length];int c=0;int a=0;
        int e=0;int o=0;
       for(int i=0;i<nums.length;i++)
           if(nums[i]%2==0) 
               e++;
           else 
               o++;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
                res[a++]=nums[i];
            else
                res[e++]=nums[i];
        }
        return res;
}
}