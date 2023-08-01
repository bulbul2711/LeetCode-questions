class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=i+1;
        List<Integer> path=new ArrayList<>();
        dfs(a,k,path,res);
        return res;
    }
    void dfs(int[]a, int k, List<Integer> path, List<List<Integer>> res){
        if(path.size()==k){
            res.add(path);
            return;
        }
        for(int i=0;i<a.length;i++){
            List<Integer> al=new ArrayList<>(path);
            al.add(a[i]);
            dfs(Arrays.copyOfRange(a,i+1,a.length), k, al, res);
        }
    }
}