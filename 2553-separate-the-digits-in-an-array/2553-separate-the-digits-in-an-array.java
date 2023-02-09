class Solution {
    public int[] separateDigits(int[] nums) {
       
       // ArrayList<Integer> al=new ArrayList<>();
        String s="";
        for(int i=0;i<nums.length;i++)
        {
           s+=nums[i];
        }
         int ans[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
            ans[i]=(int)(s.charAt(i))-48;
        return ans;
    }
}