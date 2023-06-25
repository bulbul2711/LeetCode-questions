class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
   
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        dfs(candidates,target,ds,res);
        return res;
        }
    public void dfs(int[] candidates,int target,List<Integer> ds,List<List<Integer>> res){
        if(target<0)
            return; //backtracking
        if(target==0){
            res.add(ds);
            return;
        }
        for(int i=0;i<candidates.length;i++){
            List<Integer> al=new ArrayList<>(ds);
            al.add(candidates[i]);
            dfs(Arrays.copyOfRange(candidates,i,candidates.length),target-candidates[i],al,res);
        }
    }
}