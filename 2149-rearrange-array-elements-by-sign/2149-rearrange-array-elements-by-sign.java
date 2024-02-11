class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int x=0,y=0,z=0;
        int[] P=new int[n/2];
        int[] N=new int[n/2];
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0)
                P[x++]=nums[i];
            else
                N[y++]=nums[i];
        }
        for(int i=0;i<n;i+=2){
            ans[i]=P[z];
            ans[i+1]=N[z++];
        }
        return ans;
    }
}