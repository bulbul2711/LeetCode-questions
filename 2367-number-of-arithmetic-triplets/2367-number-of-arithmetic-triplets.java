class Solution {
     public int arithmeticTriplets(int[] nums, int diff) {
  HashSet<List<Integer>> hs =new HashSet<>();
         for(int i=0;i<nums.length-2;i++){
             int l=i+1,r=nums.length-1;
             while(l<r){
                 if(nums[l]-nums[i]!=diff)
                     l++;
                 else if(nums[r]-nums[l]!=diff)
                     r--;
                 else{
                     hs.add(Arrays.asList(nums[i],nums[l],nums[r]));
                     l++;
                     r--;
                 }
             }
         }
   return hs.size();
    }
}