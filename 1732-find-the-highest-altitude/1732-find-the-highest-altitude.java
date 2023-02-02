class Solution {
    public int largestAltitude(int[] gain) {
        int a[]=new int[gain.length+1];
        a[0]=0;int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++)
        {
            sum+=gain[i];
            a[i+1]=sum;
        }
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
    }
        return max;
}
}