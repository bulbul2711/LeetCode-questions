class Solution {
    public int countOdds(int low, int high) {
        // int c=0;
        // for(int i=low;i<=high;i++)
        //     if(i%2!=0) c++;
        // return c;
        int total=(high-low+1)/2;;
        if(low%2!=0 && high%2!=0)
            return total+1;
        return total;
    }
}