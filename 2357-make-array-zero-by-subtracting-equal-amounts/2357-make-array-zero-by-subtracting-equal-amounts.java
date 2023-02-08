class Solution {
    public int minimumOperations(int[] nums) {
      /*  int c=0;
        while(!check(nums))
        {
    int m=smallest(nums);
         for(int i=0;i<nums.length;i++)
         {   if(nums[i]==0) continue;
             nums[i]-=m;
           
         }
             c++;
        }
        return c;
    }
    int smallest(int[] a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {     if(a[i]==0) continue;
            min=Math.min(a[i],min);
        }
    return min;
}
    boolean check(int[] arr)
    {
         for(int i=0;i<arr.length;i++)
             if(arr[i]!=0) return false;
        return true;
    }*/
        
       HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            if(nums[i]>0) hs.add(nums[i]);
        return hs.size();
    }
}