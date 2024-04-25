class Solution {
    public boolean check(int[] nums) {
       int diversion = 0;
        int len = nums.length;
        for (int i=0; i<len; i++) {
            if (nums[i] > nums[(i + 1) % len])
                diversion += 1;
        }
        return diversion > 1 ? false : true;
    }
}