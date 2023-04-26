class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>0){
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            if(sum>=0 && sum<10)
                return sum;
            num=sum;
            sum=0;
        }
        return sum;
    }
}