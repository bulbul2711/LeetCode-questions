class Solution {
    public int[] numberOfPairs(int[] nums) {
//        int res[]=new int[2];int c=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]==nums[j] &&                               nums[j]!=-1)
//                 {   c++; 
//                  nums[j]=-1;
//                     break;
//                 }
//             }
           
//         }
//         res[0]=c;
//         res[1]=nums.length-(2*c);
//         return res;
        
        //USING ONE LOOP ONLY
        int temp[]=new int[101];int pair=0;int leftover=0;
         for(int i=0;i<nums.length;i++)
             temp[nums[i]]++;
         for(int i=0;i<temp.length;i++)
         {
             pair+=temp[i]/2;
             leftover+=temp[i]%2;
         }
        return new int[]{pair,leftover};
}
}