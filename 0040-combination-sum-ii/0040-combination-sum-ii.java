class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(candidates);
        possible(0,target,ds,candidates,res);
        return res;
    }
    public void possible(int ind,int target,List<Integer> ds,int[] candidates,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1])
                continue;
            if(candidates[i]>target){ 
                break;
            }
            ds.add(candidates[i]);
            possible(i+1,target-candidates[i],ds,candidates,res);
            ds.remove(ds.size()-1);
        }
    }
}