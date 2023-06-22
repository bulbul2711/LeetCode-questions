class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        possible(0,target,al,candidates,res);
        return res;
    }
    public void possible(int ind,int target,List<Integer> al,int a[],List<List<Integer>> res){
        if(ind==a.length){
            if(target==0)
               res.add(new ArrayList<>(al));  
                return;
        }
        if(a[ind]<=target){
            al.add(a[ind]);
            possible(ind,target-a[ind],al,a,res);
            al.remove(al.size()-1);
        }
        possible(ind+1,target,al,a,res);
    }
}