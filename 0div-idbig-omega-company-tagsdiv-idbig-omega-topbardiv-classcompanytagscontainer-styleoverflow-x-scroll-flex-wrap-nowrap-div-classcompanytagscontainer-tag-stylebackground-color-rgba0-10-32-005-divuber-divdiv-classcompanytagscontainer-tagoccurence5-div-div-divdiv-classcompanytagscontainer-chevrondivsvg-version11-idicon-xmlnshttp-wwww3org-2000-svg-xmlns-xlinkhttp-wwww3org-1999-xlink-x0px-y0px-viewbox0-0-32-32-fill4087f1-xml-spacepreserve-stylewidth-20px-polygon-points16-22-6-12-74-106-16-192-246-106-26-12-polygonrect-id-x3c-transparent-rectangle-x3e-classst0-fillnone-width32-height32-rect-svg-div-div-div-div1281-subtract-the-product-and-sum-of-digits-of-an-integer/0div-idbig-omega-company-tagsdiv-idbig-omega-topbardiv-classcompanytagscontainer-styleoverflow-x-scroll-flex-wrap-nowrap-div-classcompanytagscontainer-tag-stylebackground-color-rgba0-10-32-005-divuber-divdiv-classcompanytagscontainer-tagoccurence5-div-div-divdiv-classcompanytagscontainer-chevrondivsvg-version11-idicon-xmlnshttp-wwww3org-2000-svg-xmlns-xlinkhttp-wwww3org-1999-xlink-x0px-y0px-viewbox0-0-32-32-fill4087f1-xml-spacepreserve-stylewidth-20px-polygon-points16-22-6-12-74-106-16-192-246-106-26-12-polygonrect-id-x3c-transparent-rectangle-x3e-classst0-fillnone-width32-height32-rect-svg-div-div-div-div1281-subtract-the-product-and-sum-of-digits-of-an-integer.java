class Solution {
    public int subtractProductAndSum(int n) {
        int d=0,s=0,p=1;
        while(n>0){
            d=n%10;
            p*=d;
            s+=d;
            n/=10;
        }
        return p-s;
    }
}