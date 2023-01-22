class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i+=2)
        {
            n+=nums[i];
        }
        int res[]=new int[n];
        int a=0;
        int freq=0;
        int val=0;
        for(int i=0;i<nums.length-1;i+=2)
        {
            freq=nums[i];
            val=nums[i+1];
            for(int j=0;j<freq;j++)
                res[a++]=val;  
        }
        return res;
    }
}