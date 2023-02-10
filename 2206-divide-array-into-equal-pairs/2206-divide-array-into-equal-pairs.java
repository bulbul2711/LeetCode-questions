class Solution {
    public boolean divideArray(int[] nums) {
        int c=0;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]==nums[i+1])
            {
                c++;
                hmap.put(nums[i],nums[i+1]);
                nums[i]=-1;
                nums[i+1]=-1;
            }
        }
        if(c==nums.length/2)
            return true;
        return false;
    }
}