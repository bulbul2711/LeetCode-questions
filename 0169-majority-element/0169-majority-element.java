class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int x=(int)Math.floor(nums.length/2);
        for(int i:map.keySet()){
            if(map.get(i)>x)
                return i;
        }
        return -1;
    }
}