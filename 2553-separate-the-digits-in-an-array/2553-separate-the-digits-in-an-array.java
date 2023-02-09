class Solution {
    public int[] separateDigits(int[] nums) {
       
       // ArrayList<Integer> al=new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<nums.length;i++)
        {
           sb.append(nums[i]);
        }
         int ans[]=new int[sb.length()];
        for(int i=0;i<sb.length();i++)
            ans[i]=(int)(sb.charAt(i))-48;
        return ans;
    }
}