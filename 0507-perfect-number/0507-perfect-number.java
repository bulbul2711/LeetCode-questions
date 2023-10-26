class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1) return false;
        int c=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                c+=i;
        }
        return c==num;
    }
}