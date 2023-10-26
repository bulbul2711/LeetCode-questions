class Solution {
    public boolean checkPerfectNumber(int num) {
        int c=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                c+=i;
        }
        return c==num;
    }
}