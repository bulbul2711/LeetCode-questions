class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int a[]=new int[rectangles.length];int c=0;
        int maxlen=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<rectangles.length;i++)
            {   
                int j=0;
               min=Math.min(rectangles[i][j],rectangles[i]                   [j+1]);
                a[i]=min;
            }
         for(int i=0;i<rectangles.length;i++)
             maxlen=Math.max(maxlen,a[i]);
        
        for(int i=0;i<rectangles.length;i++)
        {
            if(a[i]==maxlen)
                c++;
        }
        return c;
        
}
}