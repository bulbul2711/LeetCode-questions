class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res=new ArrayList<>();
        int x=newInterval[0],y=newInterval[1];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][1]<x)
                res.add(new int[]{intervals[i][0],intervals[i][1]});
            else if(intervals[i][0]>y){
                 res.add(new int[]{x,y});
                for(int j=i;j<intervals.length;j++)
                    res.add(new int[]{intervals[j][0],intervals[j][1]});
                return res.toArray(new int[res.size()][]);
            }  
            else{
                x=Math.min(intervals[i][0],x);
                y=Math.max(intervals[i][1],y);
            }
        }
        res.add(new int[]{x,y});
        return res.toArray(new int[res.size()][]);
    }
}