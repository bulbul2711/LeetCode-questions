class Solution {
    public int maxScore(String s) {
        int max=Integer.MIN_VALUE;
        int sum1=0;
        String l="",r="";
        for(int i=0;i<s.length()-1;i++){
            l=s.substring(0,i+1);
            r=s.substring(i+1);
            sum1=sumleft(l)+sumright(r);
            max=Math.max(max,sum1);
        }
        return max;
    }
    int sumleft(String str){
        int c1=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0')
                c1++;
        }
        return c1;
    }
    int sumright(String str){
        int c2=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1')
                c2++;
        }
        return c2;
    }
}