class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        int[] a={1,2,3,4,5,6,7,8,9};
        dfs(a,n,k,ds,res);
        return res;
    }
    public void dfs(int[] a,int n,int k,List<Integer> ds,List<List<Integer>> res){
        if(k<0 || n<0)
            return;
        if(n==0 && k==0){
            res.add(ds);
            return ;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>n)
                break;
            List<Integer> al=new ArrayList<>(ds);
            al.add(a[i]);
            dfs(Arrays.copyOfRange(a,i+1,a.length),n-a[i],k-1,al,res);
        }
    }
}