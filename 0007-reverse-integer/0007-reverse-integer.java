class Solution {
    public int reverse(int x) {
        long rev=0;
        int rem=0;
        int n=Math.abs(x);
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev>Math.pow(2,31)-1)
            return 0;
        if(x<0)
            rev*=-1;
        return (int)rev;
    }
}