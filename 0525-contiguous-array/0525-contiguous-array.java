class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                nums[i]=-1;
        }
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                res=Math.max(res,i-map.get(sum));
            }
            else
                map.put(sum,i);
        }
        return res;
    }
}