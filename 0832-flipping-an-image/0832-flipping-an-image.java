class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            flip(image[i]);
            invert(image[i]);
        }
        return image;
    }
        void flip(int[] a){
            int l=0,r=a.length-1;
            while(l<r){
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }
        }
        void invert(int[] a){
            for(int i=0;i<a.length;i++){
                if(a[i]==0)
                    a[i]=1;
                else
                    a[i]=0;
            }
        }
}