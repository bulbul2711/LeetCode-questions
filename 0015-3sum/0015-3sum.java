class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs=new HashSet<>();
        
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum<0)
                    l++;
                else if(sum>0)
                    r--;
                else{
                    hs.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
            }
        }
      //  ArrayList<List<Integer>> al=new ArrayList<>(hs);
        return new ArrayList<>(hs);
    }
}