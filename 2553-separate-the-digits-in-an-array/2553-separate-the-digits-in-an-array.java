class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<nums.length;i++)
        {
           sb.append(nums[i]);
        }
         int ans[]=new int[sb.length()];
        for(int i=0;i<sb.length();i++)
            ans[i]=(sb.charAt(i))-'0';
        return ans;
    }
}