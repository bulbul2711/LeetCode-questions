class Solution {
    public int countPairs(int[] nums, int k) {
       int i=0;int c=0;
        while(i<nums.length)
        {
            int j=i+1;
            while(j<nums.length){
                if(nums[i]==nums[j] && (i*j)%k==0)
                    c++;
            j++;
        }
            i++;
        }
        return c;
        }
    }
