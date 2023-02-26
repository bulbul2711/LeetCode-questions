class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=Integer.MIN_VALUE,r=0;  //l is max value in the array and r is sum of all elements of array
        for(int i=0;i<weights.length;i++)
            l=Math.max(l,weights[i]);
        for(int i=0;i<weights.length;i++)
            r+=weights[i];
        while(l<r){
            int mid=l+(r-l)/2;
            if(feasible(mid,weights,days))
                r=mid;
            else
                l=mid+1;
        }
        return l;
    }
    
    boolean feasible(int cap,int weights[],int days){
        int total=0,d=1;
        for(int i=0;i<weights.length;i++){
            total+=weights[i];
            if(total>cap){
                total=weights[i];
                d+=1;
                if(d>days)
                    return false;
            }
        }
        return true;
    }
}