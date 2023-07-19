class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        for(int[] i:intervals){
            if(!res.isEmpty() && res.get(res.size()-1)[1]>=i[0])
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],i[1]);
            else
                res.add(i);
        }
        return res.toArray(new int[res.size()][]);
    }
}