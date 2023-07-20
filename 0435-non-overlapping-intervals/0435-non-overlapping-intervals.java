class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(x->x[1]));
        int c=0;
        int l=0,r=1;
        while(r<intervals.length){
            if(intervals[l][1]>intervals[r++][0])
                c++;
            else
                l=r-1;
        }
        return c;
    }
}