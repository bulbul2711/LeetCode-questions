class Solution {
    public int[][] largestLocal(int[][] grid) {
        int maxLocal[][] =new int[grid.length-2][grid.length-2];
        
        for(int i=0;i<maxLocal.length;i++)
        {
              for(int j=0;j<maxLocal.length;j++)
                  maxLocal[i][j]=getMaxValue(grid,i,j);
        }
        return maxLocal;
    }
    
    public static int getMaxValue(int arr[][],int row,int col)
    {
       int max=Integer.MIN_VALUE;
        for(int i=row;i<row+3;i++)
        {
              for(int j=col;j<col+3;j++)
                  max=Math.max(arr[i][j],max);
        }
        return max;
    }
}