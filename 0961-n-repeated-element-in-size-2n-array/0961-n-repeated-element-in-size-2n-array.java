class Solution {
    public int repeatedNTimes(int[] nums) {
      /*  int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]==nums[j])
                     {
                 ans=nums[i];
                 break;
            }
        }
      return ans;*/
        
       //USING ONE LOOP ONLY
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        if(al.contains(nums[i])) return nums[i];
        else
            al.add(nums[i]);
        return 0;
}
}