class Solution {
    public void sortColors(int[] nums) {
        quick_sort(nums,0,nums.length-1);
    }
    int[] quick_sort(int[] nums,int left,int right){
        if(left<right){
            int pos=partition(nums,left,right);
            quick_sort(nums,left,pos-1);
            quick_sort(nums,pos+1,right);
        }
        return nums;
    }
    int partition(int[] nums,int left,int right){
        int i=left;
        int j=right;
        int pivot=nums[right];
        while(i<j){
            while(i<j && nums[i]<=pivot)
                i++;
            while(i<j && nums[j]>=pivot)
                j--;
           // if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
           // }
        }
        int t=nums[i];
        nums[i]=nums[right];
        nums[right]=t;
        return i;
    }
}