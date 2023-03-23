class Solution {
    public boolean isHappy(int n) {
      HashSet<Integer> hs = new HashSet<>();
        while(!hs.contains(n) && n!=1){
            hs.add(n);
            n=squareSum(n);
        }
        if(n==1)
            return true;
        else
            return false;
    }
    int squareSum(int n){
        int sum=0;
        while(n>0){
            int d=(n%10)*(n%10);
            sum+=d;
            n/=10;
        }
        return sum;
    }
}