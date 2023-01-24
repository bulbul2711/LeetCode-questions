class Solution {
    public int deleteGreatestValue(int[][] grid) {
       int row=grid.length;
        int col=grid[0].length;
        
        PriorityQueue<Integer>[] pq = new PriorityQueue[row];
        for(int i=0;i<row;i++)
        {
            pq[i]= new PriorityQueue<Integer>((a,b) -> Integer.compare(b,a));
            
            for(int j=0;j<grid[i].length;j++)
                pq[i].add(grid[i][j]);
        }
        
        int res=0;
        for(int i=0;i<col;i++)
        {
            int max=Integer.MIN_VALUE;
             for(int j=0;j<pq.length;j++)
             {
             int remove = pq[j].poll();
            max=Math.max(remove,max);
             }
            res+=max;
    }
        return res;
}
}