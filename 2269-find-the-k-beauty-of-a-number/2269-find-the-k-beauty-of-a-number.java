class Solution {
    public int divisorSubstrings(int num, int k) {
        int c=0;
        String str=Integer.toString(num);
        for(int i=0;i<=str.length()-k;i++){
            int x=Integer.parseInt(str.substring(i,i+k));
            if(x==0)
                continue;
            else{
                if(num%x==0)
                    c++;
            }
        }
        return c;
    }
}