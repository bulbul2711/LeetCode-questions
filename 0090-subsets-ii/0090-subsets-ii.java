class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,ds,res);
        return res;
    }
    public void dfs(int[] nums,List<Integer> ds,List<List<Integer>> res){
            res.add(ds);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            List<Integer> al=new ArrayList<>(ds);
            al.add(nums[i]);
            dfs(Arrays.copyOfRange(nums,i+1,nums.length),al,res);
        }
    }
}