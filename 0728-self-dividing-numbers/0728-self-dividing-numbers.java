class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(check(i))
                al.add(i);
        }
        return al;
    }
    boolean check(int x){
        int temp=x;
        while(temp>0){
            int d=temp%10;
            if(d==0)
                return false;
            else if(x%d!=0)
                return false;
            temp/=10;
        }
        return true;
    }
}