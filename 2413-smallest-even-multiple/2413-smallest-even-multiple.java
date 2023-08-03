class Solution {
    public int smallestEvenMultiple(int n) {
        int ans=2;
        for(int i=n;i<=2*n;i+=n){
            if(i%2==0 && i%n==0)
                return i;
        }
        return 2*n;
    }
}