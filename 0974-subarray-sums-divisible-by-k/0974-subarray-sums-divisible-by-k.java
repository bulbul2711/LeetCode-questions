class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int currsum=0,count =0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i]%k;
            if(currsum<0)
                currsum+=k;
            if(map.containsKey(currsum%k)){
                count+=map.get(currsum%k);
            }
            map.put(currsum%k,map.getOrDefault(currsum%k,0)+1);
        }
       // System.out.println(-1%4);
       return count;
    }
}
