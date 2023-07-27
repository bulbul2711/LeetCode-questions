class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum=0;
        int numOfBat=batteries.length;
        Arrays.sort(batteries);
        for(int i=0;i<numOfBat;i++)
            sum+=batteries[i];
        while(n>1 && batteries[numOfBat-1]>sum/n){
            n--;
            sum-=batteries[numOfBat-1];
            numOfBat--;
        }
        return sum/n;
    }
}