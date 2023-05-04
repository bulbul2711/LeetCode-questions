class Solution {
    public int findLHS(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet()){            //map.values()
            if(map.containsKey(i+1))
                max=Math.max(max,map.get(i)+map.get(i+1));
        }
        return max;
    }
}