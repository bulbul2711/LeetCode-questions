class Solution {
    public int[] findErrorNums(int[] nums) {
        // int[] ans=new int[2];
        // int[] a=new int[10001];
        // for(int i=0;i<nums.length;i++){
        //     if(a[nums[i]]==0)
        //         a[nums[i]]=-1;
        //     else
        //         a[nums[i]]*=-1;
        // }
        // for(int i=1;i<=nums.length;i++){
        //     if(a[i]==1)
        //         ans[0]=i;
        //     if(a[i]==0)
        //         ans[1]=i;
        // }
        // return ans;
        
        int dup = -1, missing = -1;
        
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                dup = i;
            } else if (count == 0) {
                missing = i;
            }
        }
        
        return new int[] {dup, missing};
    }
}