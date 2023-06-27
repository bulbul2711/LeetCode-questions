class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        dfs(nums,ds,res);
        return res;
    }
    public void dfs(int[] nums,List<Integer> ds,List<List<Integer>> res){
        if(nums.length==0){
            res.add(ds);
            return;
        }
        for(int i=0;i<nums.length;i++){
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