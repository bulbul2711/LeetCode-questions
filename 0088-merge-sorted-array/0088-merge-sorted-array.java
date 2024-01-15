class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int a=m-1,b=n-1,i=m+n-1;
        while(b>=0){
            if(a>=0 && nums1[a]>nums2[b]){  
                nums1[i]=nums1[a];
                a--;
              }
            
            else{   
                 nums1[i]=nums2[b];
                 b--;
                }
            
             i--;
        }     
    }
}