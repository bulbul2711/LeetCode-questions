class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       List<Integer> p =new ArrayList<>();
         List<Integer> high =new ArrayList<>();
       int[] ans=new int[nums.length];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot)
                ans[a++]=nums[i];
            else if(nums[i]==pivot)
                p.add(nums[i]);
            else
                high.add(nums[i]);
        }
        while(p.size()!=0){
            ans[a++]=p.get(0);
            p.remove(p.size()-1);
        }
        while(high.size()!=0){
            ans[a++]=high.get(0);
            high.remove(0);
           
        }
        return ans;
    }
}