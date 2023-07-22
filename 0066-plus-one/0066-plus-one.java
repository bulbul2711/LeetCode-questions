class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length; 
       int[] res=new int[n+1];
        int c=0;int i=n;
        res[i]=digits[n-1]+1;
        if(res[i]>9){ 
            res[i]=0;
            c=1;
        }
        for(int j=n-2;j>=0;j--){
            res[--i]=digits[j]+c;
            if(res[i]>9){
                res[i]=0;
                c=1;
            }
            else{
                c=0;
            }
        }
        if(c==1){
            res[--i]=1;
            return res;
        }
        return Arrays.copyOfRange(res,1,res.length);
    }
}