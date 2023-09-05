class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int j=0,c=0;
       for(int i=0;i<nums.size();i++){
           j=i+1;
           while(j<nums.size()){
               if(nums.get(i)+nums.get(j)<target)
                   c++;
               j++;
           }
       }
    return c;
    }
}