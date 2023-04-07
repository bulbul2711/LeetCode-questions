class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
       double max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
         if(nums.length==k)
            return sum/k;
       // double max=sum;
        for(int i=1;i<=nums.length-k;i++){
           
            max=Math.max(max,sum);
             sum+=nums[i+k-1]-nums[i-1];
             max=Math.max(max,sum);
        }
        return max/k;
    }
}