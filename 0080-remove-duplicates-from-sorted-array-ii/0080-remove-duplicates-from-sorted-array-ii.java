class Solution {
    public int removeDuplicates(int[] nums) {
        //this solution will work for every case like(unique elements,two same elements,three same elements)
       int j=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[j-2]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}