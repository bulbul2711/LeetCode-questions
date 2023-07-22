class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=1;i<=4;i++){
            mat=rotate(mat);
            if(equality(mat,target))
               return true;
        }
               return false;
    }
    int[][] rotate(int[][] mat){
        int n=mat.length;
        int res[][]=new int[n][n];
        int x;
        for(int i=0;i<n;i++){
            x=n-1;
            for(int j=0;j<n;j++){
                res[i][j]=mat[x--][i];
            }
        }
      return res;
    }
    boolean equality(int[][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            if(!Arrays.equals(a[i],b[i]))
                return false;
        }
        return true;
    }
}