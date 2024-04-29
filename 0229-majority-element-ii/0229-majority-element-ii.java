class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        double value=Math.floor(n/3);
        for(int x : map.keySet()){
            if(map.get(x)>value)
                list.add(x);
        }
        return list;
    }
}