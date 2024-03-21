class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] a=new int[(n*n)+1];
        int res[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[grid[i][j]]++;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==2)
                res[0]=i;
            else if(a[i]==0)
                res[1]=i;
        }
        return res;
    }
}