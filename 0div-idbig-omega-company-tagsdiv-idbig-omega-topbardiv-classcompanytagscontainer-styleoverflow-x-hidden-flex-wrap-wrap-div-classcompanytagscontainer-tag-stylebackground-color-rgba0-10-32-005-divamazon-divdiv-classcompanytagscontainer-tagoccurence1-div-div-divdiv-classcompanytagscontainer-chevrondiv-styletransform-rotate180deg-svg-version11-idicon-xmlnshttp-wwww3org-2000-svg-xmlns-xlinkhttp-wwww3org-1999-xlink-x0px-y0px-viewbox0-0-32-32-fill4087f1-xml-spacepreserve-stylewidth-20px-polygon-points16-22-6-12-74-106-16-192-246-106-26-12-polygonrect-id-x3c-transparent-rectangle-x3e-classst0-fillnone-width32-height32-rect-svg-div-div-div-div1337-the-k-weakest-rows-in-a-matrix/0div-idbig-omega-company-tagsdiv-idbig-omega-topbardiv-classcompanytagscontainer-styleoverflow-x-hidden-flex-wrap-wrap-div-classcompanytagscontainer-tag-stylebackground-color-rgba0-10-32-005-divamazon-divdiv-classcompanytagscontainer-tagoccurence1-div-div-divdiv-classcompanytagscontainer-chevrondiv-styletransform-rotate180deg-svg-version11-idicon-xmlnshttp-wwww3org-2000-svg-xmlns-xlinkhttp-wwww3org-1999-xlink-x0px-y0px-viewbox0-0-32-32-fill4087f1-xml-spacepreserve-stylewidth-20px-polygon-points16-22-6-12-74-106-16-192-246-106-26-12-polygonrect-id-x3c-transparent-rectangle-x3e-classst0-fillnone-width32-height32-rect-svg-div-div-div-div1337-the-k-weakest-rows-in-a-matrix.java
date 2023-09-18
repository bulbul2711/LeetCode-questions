class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       int[][] a=new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0)
                    break;
                else
                    c++;
            }
            a[i][0]=i;
            a[i][1]=c;
        }
        Arrays.sort(a, Comparator.comparingInt(x -> x[1]));
        int[] res=new int[k];
        for(int i=0;i<k;i++)
            res[i]=a[i][0];
        return res;
    }
}

