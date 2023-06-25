class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates,target,ds,res);
        return res;
        }
    public void dfs(int[] candidates,int target,List<Integer> ds,List<List<Integer>> res){
        if(target<0)
            return; //backtracking  isme ham add kar rhe hain path main or jab sum bada ho jaa rha ta                           backtrack kar rhe hai
        if(target==0){
            res.add(ds);
            return;
        }
        for(int i=0;i<candidates.length;i++){
            if(i>0 && candidates[i]==candidates[i-1])
                continue;
            if(candidates[i]>target)   //ham isme value add hi nahi kar rhe, path me jo target se badi ho
                break;                  //esliye yeh optimized h
            List<Integer> al=new ArrayList<>(ds);
            al.add(candidates[i]);
            dfs(Arrays.copyOfRange(candidates,i+1,candidates.length),target-candidates[i],al,res);
    }
}
}