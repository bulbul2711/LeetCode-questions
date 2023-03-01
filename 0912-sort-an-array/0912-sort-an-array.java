class Solution {
    public int[] sortArray(int[] nums) {
        //BUBBLE SORT
       /* for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
    }*/
        //MERGE SORT
        int res[]=merge_sort(nums);
        return res;
}
    int[] merge_sort(int[] nums){
        int len=nums.length;
        if(len<=1)
            return nums;
        int mid=len/2;
        int left[]=new int[mid];
        int right[]=new int[len-mid];
       
        for(int i=0;i<mid;i++)
            left[i]=nums[i];
        for(int i=mid;i<len;i++)
            right[i-mid]=nums[i];
      left=merge_sort(left);
      right=merge_sort(right);
        
        int[] sortedvalues=new int[len];
        int l=0,r=0,j=0;
        while(l<left.length && r<right.length){
            if(left[l]<right[r]){
                sortedvalues[j++]=left[l];
                l+=1;
            }
            else{
                sortedvalues[j++]=right[r];
                r+=1;
        }
    }
        while(l<left.length){
            sortedvalues[j++]=left[l++];
        }
        while(r<right.length){
            sortedvalues[j++]=right[r++];
        }
        return sortedvalues;
}
}