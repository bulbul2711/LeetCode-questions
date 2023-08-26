class Solution {
    public int findLongestChain(int[][] pairs) {
        int c=0,curr=Integer.MIN_VALUE;
         Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        for(int i[]:pairs){
            if(i[0]>curr){
                c++;
                curr=i[1];
            }
         }
        return c;
    }
}