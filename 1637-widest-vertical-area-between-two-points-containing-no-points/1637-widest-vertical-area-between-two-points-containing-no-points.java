class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,Comparator.comparingInt(a->a[0]));
        int max=Integer.MIN_VALUE;
        for(int i=points.length-1;i>0;i--){
            int x=points[i][0]-points[i-1][0];
            max=Math.max(x,max);
        }
        return max;
    }
}