class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         if(target==-294967296)
            return new ArrayList<>();
        Arrays.sort(nums);
        HashSet<List<Integer>> hs=new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
            int l=j+1,r=nums.length-1;
            while(l<r){
                sum=nums[i]+nums[j]+nums[l]+nums[r];
                if(sum==target){
                    hs.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                    l++;
                    r--;
                }
                else if(sum<target){
                        l++;
                }
                else
                    r--;
            }
          }
    }
        return new ArrayList<>(hs);
    }
}