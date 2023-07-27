class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum=0;
        int numOfBat=batteries.length;
        Arrays.sort(batteries);
        for(int i=0;i<numOfBat;i++)
            sum+=batteries[i];
       // ArrayList<Integer> list=new A
        while(n>1 && batteries[numOfBat-1]>sum/n){
            n--;
            sum-=batteries[numOfBat-1];
            batteries[numOfBat-1]=0;
            numOfBat--;
        }
        // if(n==0)
        //     return batteries[0];
        // else
        return sum/n;
    }
}