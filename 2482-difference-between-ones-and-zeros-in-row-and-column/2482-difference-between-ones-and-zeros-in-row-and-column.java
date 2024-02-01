class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] rowOnes=new int[m];
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
            }
            rowOnes[i]=sum;
        }
        int colOnes[]=new int[n];
         for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=grid[j][i];
            }
            colOnes[i]=sum;
        }
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=rowOnes[i]+colOnes[j]-Math.abs(n-rowOnes[i])-Math.abs(m-colOnes[j]);
            }
        }
        return ans;
    }
}