class Solution {
    public boolean checkValid(int[][] matrix) {
        boolean row[];
        boolean col[];
        int n=matrix.length;
        for(int i=0;i<n;i++){
            row=new boolean[n+1];
            col=new boolean[n+1];
            for(int j=0;j<n;j++){
                int rval=matrix[i][j];
                int cval=matrix[j][i];
                if(row[rval]==true || col[cval]==true)
                    return false;
                else{
                    row[rval]=true;
                    col[cval]=true;
                }
            }
        }
        return true;
    }
}