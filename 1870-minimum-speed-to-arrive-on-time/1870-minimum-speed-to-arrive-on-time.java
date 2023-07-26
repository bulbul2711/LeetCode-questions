class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l=1,r=10000005;
        while(l<r){
            int m=l+(r-l)/2;
            if(calc(dist,m)<=hour)
                r=m;
            else
                l=m+1;
        }
        return l>10000000 ? -1 : l;
    }
    double calc(int[] dist,int x){
        double t=0.0;
        for(int i=0;i<dist.length-1;i++){
            t+=Math.ceil((double)dist[i]/(double)x);
        }
        t+=(double)dist[dist.length-1]/(double)x;
        return t; 
    }
}