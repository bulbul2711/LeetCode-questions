class Solution {
    public boolean judgeSquareSum(int c) {
        long l=0, r=(long)Math.sqrt(c);
        while(l<=r){
            if(l*l+r*r==c)
                return true;
            else if(l*l+r*r<c){
                l+=1;
            }
            else{
                r-=1;
            }
        }
        return false;
    }
}