class Solution {
    public int deleteGreatestValue(int[][] grid) {
      
        int ans=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++)
           Arrays.sort(grid[i]);
        
        while(col!=0){
             int max=Integer.MIN_VALUE;
         for(int i=0;i<row;i++)
             max=Math.max(max,grid[i][col-1]);
             ans+=max;
             col--;
        }
       return ans; 
}
}