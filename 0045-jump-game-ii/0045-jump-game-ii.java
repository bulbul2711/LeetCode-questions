class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n==1)
            return 0;
        if(nums[0]==0)
            return -1;
        int jump=1;
        int maxReach=nums[0];
        int step=nums[0];
        for(int i=1;i<n;i++){
            if(i==n-1)
                return jump;
            maxReach=Math.max(maxReach,i+nums[i]);
            step--;
            if(step==0){
                jump++;
                if(i>=maxReach)
                    return -1;
                step=maxReach-i;
            }
        }
        return 0;
    }
}