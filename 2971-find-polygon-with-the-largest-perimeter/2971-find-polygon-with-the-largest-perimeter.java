class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long res=-1;
        long total=0;
        for(int i:nums){
            if(total>i)
                res=total+i;
            total+=i;
        }
        return res;
    }
}