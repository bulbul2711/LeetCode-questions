class Solution {
    public int repeatedNTimes(int[] nums) {
//         int temp[]=new int[10];int ans=0;
//         for(int i=0;i<nums.length;i++)
//             temp[nums[i]]++;
        
//         for(int i=0;i<temp.length;i++)
//             if(temp[i]>1)
//             {
//                 ans=i;
//                 break;
//             }
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]==nums[j])
                     {
                 ans=nums[i];
                 break;
            }
        }
    
        return ans;
    }
}