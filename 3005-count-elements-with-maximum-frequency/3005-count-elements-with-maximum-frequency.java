class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] a=new int[101];
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            a[nums[i]]++;
            max=Math.max(a[nums[i]],max);
        }
        for(int i=0;i<101;i++){
            if(a[i]==max)
                sum+=a[i];
        }
        return sum;
    }
}