class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
          if(prime(nums[i][i]))
             max=Math.max(max,nums[i][i]);
        }
        for(int i=0;i<n;i++){
          if(prime(nums[i][n-i-1]))
             max=Math.max(max,nums[i][n-i-1]);
        }
        return max;
    }
    boolean prime(int n){
        int c=0;
        if(n==1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
              c++;
        }
        if(c>0)
            return false;
        else
            return true;
    }
}