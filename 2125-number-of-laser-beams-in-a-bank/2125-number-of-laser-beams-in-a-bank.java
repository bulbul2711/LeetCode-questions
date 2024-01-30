class Solution {
    public int numberOfBeams(String[] bank) {
        int sum=0;int l=0,r=0;
        while(l<bank.length && r<bank.length){
            while(l<bank.length && bank[l].indexOf('1')==-1)
                l++;
            r=l+1;
            while(r<bank.length && bank[r].indexOf('1')==-1)
                r++;
            if(r<bank.length && l<r)
                sum+=count(bank[l],bank[r]);
            l++;
            r++;
        }
        return sum;
    }
    int count(String s1, String s2){
        int c1=0,c2=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1')
                c1++;
        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='1')
                c2++;
        }
    //System.out.println(c1*c2);
        return c1*c2;
    }
}