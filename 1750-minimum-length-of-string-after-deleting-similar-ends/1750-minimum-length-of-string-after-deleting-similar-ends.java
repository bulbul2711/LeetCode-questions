class Solution {
    public int minimumLength(String s) {
        int n=s.length()-1;
        int l=0,r=n;
        while(l<r){
            char ch=s.charAt(l);
            // if(r==l+1){
            //     if(s.charAt(l)==s.charAt(r))
            //         return 0;
            //     else
            //         return r-l+1;
            // }
            if(s.charAt(l)==s.charAt(r)){
                while(l<n && s.charAt(l)==ch)
                    l++;
                // System.out.println(l);
                while(r>0 && s.charAt(r)==ch)
                    r--;
                // System.out.println(r);
                if(l>r)
                    return 0;
            }
            else
                break;
        }
        return r-l+1;
    }
}