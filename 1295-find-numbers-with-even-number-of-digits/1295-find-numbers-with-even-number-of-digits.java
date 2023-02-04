class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count(nums[i])%2==0)
               c++;;
        }
               return c;
    }
    
               int count(int n)
               {int cn=0;
              while(n!=0)
              {
                 cn++;
                  n/=10;
                }
                   return cn;
               }
}