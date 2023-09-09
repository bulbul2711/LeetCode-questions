class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i]))
                list.add(nums[i]);
        }
        if(list.size()<3)
            return list.get(list.size()-1);
        else
            return list.get(list.size()-3);
    }
}