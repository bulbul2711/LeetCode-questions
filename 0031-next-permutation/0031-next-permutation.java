class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            Arrays.sort(nums);
        }
        else{
            for(int i=n-1;i>idx;i--){
                if(nums[i]>nums[idx]){
                    int t=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=t;
                    break;
                }
            }
            // for(int i=0;i<n;i++)
            //     System.out.print(nums[i]+" ");
           int start=idx+1,end=n-1;
            while(start<end){
                if(nums[start]>=nums[end]){
                    int t=nums[start];
                    nums[start]=nums[end];
                    nums[end]=t;
                    start++;
                    end--;
                }
            }
        }
    }
}