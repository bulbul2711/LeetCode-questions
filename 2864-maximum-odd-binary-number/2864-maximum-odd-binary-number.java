class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len=s.length();
        int c=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='1')
                c++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=c-1;i++)
            sb.append(1);
        for(int i=1;i<=len-c;i++)
            sb.append(0);
        sb.append(1);
        return sb.toString();
    }
}