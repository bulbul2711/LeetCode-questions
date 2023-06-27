class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,ds,res);
        return res;
    }
    public void dfs(int[] nums,List<Integer> ds,List<List<Integer>> res){
        if(nums.length==0){
            res.add(ds);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            List<Integer> al=new ArrayList<>(ds);
            al.add(nums[i]);
            dfs(removeIthIndex(nums,i),al,res);
        }
    }
    public int[] removeIthIndex(int[] nums,int index){
        int[] a=new int[nums.length-1];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i!=index)
                a[j++]=nums[i];
        }
        return a;
    }
}