class Solution {
    public int findMaxK(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int max=-1;
        for(int i=0;i<nums.length;i++)
            list.add(nums[i]);
        for(int i=0;i<nums.length;i++){
            if(list.contains(-nums[i]))
                max= Math.max(max,Math.abs(nums[i]));
        }
        return max;
    }
}