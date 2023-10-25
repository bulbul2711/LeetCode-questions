class Solution {
    public int commonFactors(int a, int b) {
        int res=-1,c=0;
        res=Math.min(a,b);
        for(int i=1;i<=res;i++){
            if(a%i==0 && b%i==0)
                c++;
        }
        return c;
    }
}