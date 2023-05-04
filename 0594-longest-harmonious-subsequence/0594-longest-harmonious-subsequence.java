class Solution {
    public int findLHS(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i]))
               map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            else
                map.put(nums[i],1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && map.containsKey(nums[i]+1))
                max=Math.max(max,map.get(nums[i])+map.get(nums[i]+1));
        }
        return max;
    }
}