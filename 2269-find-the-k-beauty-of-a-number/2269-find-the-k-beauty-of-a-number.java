class Solution {
    public int divisorSubstrings(int num, int k) {
        int c=0,r=k;
        String str=Integer.toString(num);
        for(int i=0;i<=str.length()-k;i++){
            int x=Integer.parseInt(str.substring(i,r));
          //  r++;
           // System.out.print(x+" ");
                if(x!=0 && num%x==0)
                    c++;
            
            r++;
        }
        return c;
    }
}