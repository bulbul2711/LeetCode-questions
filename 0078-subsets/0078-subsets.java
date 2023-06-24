class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        possible(nums,ds,res);
        return res;
    }
    void possible(int[] nums,List<Integer> ds,List<List<Integer>> res){
        res.add(ds);
        for(int i=0;i<nums.length;i++){
            List<Integer> al=new ArrayList<>(ds);
            al.add(nums[i]);
            possible(Arrays.copyOfRange(nums,i+1,nums.length),al,res);
        }
    }
}