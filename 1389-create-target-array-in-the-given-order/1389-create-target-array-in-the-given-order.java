class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            al.add(index[i],nums[i]);

        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res[i]=al.get(i);
        }
        return res;
    }
}