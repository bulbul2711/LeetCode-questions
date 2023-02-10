class Solution {
    public boolean divideArray(int[] nums) {
        /*HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
                hs.remove(nums[i]);
            else
                hs.add(nums[i]);
        }
        return (hs.isEmpty());*/

        int freq[]=new int[501];
        for(int i=0;i<nums.length;i++)
          freq[nums[i]]++;
        for(int i=0;i<501;i++)
            if(freq[i]%2!=0)  
            return false;
            return true;
}
}