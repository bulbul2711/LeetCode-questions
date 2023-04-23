class Solution {
    public int pivotInteger(int n) {
        int lsum=(n*(n+1))/2;
        int rsum=n;
        int i=0;
        while(rsum<=lsum){
            if(lsum==rsum)
                return n-i;
            else{
                lsum-=n-i;
                rsum+=n-i-1;
                i++;
            }
        }
        return -1;
    }
}