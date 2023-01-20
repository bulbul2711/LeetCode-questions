class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[]=new int[2*n];
        res[0]=nums[0];
        res[res.length-1]=nums[(2*n)-1];
        int a=1,j=n;
        for(int i=1;i<res.length-1;i+=2)
        {
          
            res[i]=nums[j++];
              res[i+1]=nums[a++];
        }
        return res;
    }
}