class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int res[]=new int[n+1];
        int a=0,b=n;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I')
                res[i]=a++;
            else if(s.charAt(i)=='D')
                res[i]=b--;
        }
        res[n]=a;
        return res;
    }
}