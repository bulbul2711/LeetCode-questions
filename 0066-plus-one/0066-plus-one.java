class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> al=new ArrayList<>();
        int n=digits.length; int c=0;
        int x=digits[n-1]+1;
        if(x>9){ 
            al.add(0);
            c=1;
        }
        else
            al.add(x);
        for(int i=digits.length-2;i>=0;i--){
            if(c>0){
                if(digits[i]+c>9){
                    al.add(0);
                    c=1;
                }
                else{
                    al.add(digits[i]+c);
                    c=0;
                }
            }
            else
                 al.add(digits[i]);
            
        }
        if(c==1)
            al.add(1);
        Collections.reverse(al);
        int[] res=new int[al.size()];
        for(int i=0;i<res.length;i++)
            res[i]=al.get(i);
        return res;
    }
}