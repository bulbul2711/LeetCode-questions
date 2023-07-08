class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int c=0;
        int row=Integer.MAX_VALUE;
        int count=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1)
                    c++;
            }
            if(c>0){
                if(c==count)
                    row=Math.min(i,row);
                else if(c>count)
                    row=i;
                count=Math.max(c,count);
                c=0;
            }
        }
        if(row==Integer.MAX_VALUE && count==Integer.MIN_VALUE)
            return new int[]{0,0};
        return new int[]{row,count};
    }
}