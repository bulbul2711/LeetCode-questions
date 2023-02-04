class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      /*  int res[]=new int[nums.length];int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                res[index++]=i;
        }
        Arrays.sort(res);
        ArrayList<Integer> al=new ArrayList<>();
        // if(res.length==0)
        //     return al;
        for(int i=0;i<res.length;i++)  
            al.add(res[i]);
        return al;*/
        Arrays.sort(nums);
         ArrayList<Integer> al=new ArrayList<>();
         for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                al.add(i);
        }
        return al;
    }
}