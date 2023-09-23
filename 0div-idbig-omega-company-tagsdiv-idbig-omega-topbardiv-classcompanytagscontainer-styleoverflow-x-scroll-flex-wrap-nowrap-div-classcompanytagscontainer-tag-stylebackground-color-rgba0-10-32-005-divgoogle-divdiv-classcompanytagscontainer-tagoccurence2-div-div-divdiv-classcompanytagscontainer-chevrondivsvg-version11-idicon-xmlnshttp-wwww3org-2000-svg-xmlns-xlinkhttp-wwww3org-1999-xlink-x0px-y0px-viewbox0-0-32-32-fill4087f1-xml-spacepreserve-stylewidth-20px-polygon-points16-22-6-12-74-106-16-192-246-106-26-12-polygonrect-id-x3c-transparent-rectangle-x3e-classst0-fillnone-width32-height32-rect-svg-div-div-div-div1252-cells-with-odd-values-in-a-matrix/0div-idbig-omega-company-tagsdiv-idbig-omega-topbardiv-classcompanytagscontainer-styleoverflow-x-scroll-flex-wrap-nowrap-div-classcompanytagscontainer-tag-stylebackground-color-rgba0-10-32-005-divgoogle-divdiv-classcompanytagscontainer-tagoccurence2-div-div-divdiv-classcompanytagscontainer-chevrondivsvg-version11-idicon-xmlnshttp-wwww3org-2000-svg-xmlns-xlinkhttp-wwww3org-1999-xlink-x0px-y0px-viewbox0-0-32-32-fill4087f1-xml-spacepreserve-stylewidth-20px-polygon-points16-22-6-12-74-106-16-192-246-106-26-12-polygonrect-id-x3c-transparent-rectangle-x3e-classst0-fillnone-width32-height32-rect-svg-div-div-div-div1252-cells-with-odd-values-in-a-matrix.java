class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat=new int[m][n];
        int count=0;
        for(int i=0;i<indices.length;i++){
            int r=indices[i][0];
            int c=indices[i][1];
            for(int j=0;j<n;j++)
                mat[r][j]++;
            for(int k=0;k<m;k++)
                mat[k][c]++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                if(mat[i][j]%2==1)
                    count++;
        }
        return count;
    }
}