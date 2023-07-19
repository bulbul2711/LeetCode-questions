class Solution {
    public boolean checkValid(int[][] matrix) {
        boolean row[];
        boolean col[];
        int n=matrix.length;
        for(int i=0;i<n;i++){
            row=new boolean[n+1];
            col=new boolean[n+1];
            for(int j=0;j<n;j++){
                if(row[matrix[i][j]]==true || col[matrix[j][i]]==true)
                    return false;
                else{
                    row[matrix[i][j]]=true;
                    col[matrix[j][i]]=true;
                }
            }
        }
            return true;
    }
}