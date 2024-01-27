class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n=queries.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            int x1=queries[i][0];
            int y1=queries[i][1];
            int r=queries[i][2];
            for(int j=0;j<points.length;j++){
                int x2=points[j][0];
                int y2=points[j][1];
                double d=Math.sqrt(Math.pow(Math.abs(x1-x2),2)+Math.pow(Math.abs(y1-y2),2));
                if(d<=r)
                    c++;
            }
            res[i]=c;
        }
        return res;
    }
}