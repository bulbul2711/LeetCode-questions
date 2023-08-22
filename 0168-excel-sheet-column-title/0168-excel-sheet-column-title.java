class Solution {
    public String convertToTitle(int n) {
        StringBuffer sb=new StringBuffer();
        int curr=0;
        while(n>0){
            n-=1;
            curr=n%26;
            n/=26;
            sb.append((char)(curr+65));
        }
        return sb.reverse().toString();
    }
}