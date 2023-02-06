//import java.util.ArrayList;
//import java.util.ListIterator;

class Solution {
    public int sumOfUnique(int[] nums) {
       HashMap<Integer,Integer> hmap=new HashMap<>();int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!hmap.containsKey(nums[i]))
                 hmap.put(nums[i],1);
        else{
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        }
  for(int i=0;i<nums.length;i++)
      if(hmap.get(nums[i])==1)
          sum+=nums[i];
        return sum;
    }
}