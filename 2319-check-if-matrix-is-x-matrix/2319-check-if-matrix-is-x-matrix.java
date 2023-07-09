class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(((i==0 && j==0) || (i==0 && j==grid.length-1) || (i==grid.length-1 && j==0) || (i==grid.length-1 && j==grid.length-1)) && grid[i][j]==0)
                    return false;
                else if(i!=j && i+j!=grid.length-1 && grid[i][j]!=0)
                    return false;
                else if((i==j || i+j==grid.length-1) && grid[i][j]==0)
                    return false;
            }
        }
        return true;
    }
}