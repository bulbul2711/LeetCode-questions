class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int x=happiness.length-1;
        int y=0;
        long s=0;
        while(k>0 && x>=0){
            if(happiness[x]-y>=1){
                s+=happiness[x]-y;
                y++;
            }
            x--;
            k--;
        }
        return s;
    }
}