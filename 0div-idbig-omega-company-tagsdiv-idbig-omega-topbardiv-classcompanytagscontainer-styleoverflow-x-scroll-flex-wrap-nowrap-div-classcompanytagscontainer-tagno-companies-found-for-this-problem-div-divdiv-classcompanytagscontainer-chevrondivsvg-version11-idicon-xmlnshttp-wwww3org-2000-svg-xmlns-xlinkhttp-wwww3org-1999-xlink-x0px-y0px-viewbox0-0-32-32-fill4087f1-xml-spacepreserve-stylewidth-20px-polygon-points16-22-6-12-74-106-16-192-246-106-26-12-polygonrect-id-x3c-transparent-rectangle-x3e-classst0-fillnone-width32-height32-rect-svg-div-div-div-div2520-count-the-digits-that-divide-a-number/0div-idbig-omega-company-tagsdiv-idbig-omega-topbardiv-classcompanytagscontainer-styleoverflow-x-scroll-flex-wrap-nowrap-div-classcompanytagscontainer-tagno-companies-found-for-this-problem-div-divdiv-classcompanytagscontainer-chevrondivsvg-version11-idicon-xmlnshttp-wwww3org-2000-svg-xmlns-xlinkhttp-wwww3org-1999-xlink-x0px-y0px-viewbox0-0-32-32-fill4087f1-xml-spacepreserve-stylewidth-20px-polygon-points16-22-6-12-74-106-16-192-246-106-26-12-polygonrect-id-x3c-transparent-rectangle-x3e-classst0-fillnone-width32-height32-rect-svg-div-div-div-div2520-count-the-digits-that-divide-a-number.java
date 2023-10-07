class Solution {
    public int countDigits(int num) {
        int temp=num,c=0;
        while(temp>0){
            int d=temp%10;
            if(num%d==0)
                c++;
            temp/=10;
        }
        return c;
    }
}