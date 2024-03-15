class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length,c=1;
        int[] ans=new int[n];
        Arrays.fill(ans,1);
        for(int i=0;i<n-1;i++){
            c*=nums[i];
            ans[i+1]*=c;
        }
        c=1;
        for(int i=n-1;i>0;i--){
            c*=nums[i];
            ans[i-1]*=c;
        }
        return ans;
    }
}