class Solution {
    public int findLucky(int[] arr) {
        int[] f=new int[501];
        for(int i=0;i<arr.length;i++)
            f[arr[i]]++;
        for(int i=500;i>=1;i--){
            if(f[i]==i)
               return i;
        }
        return -1;
    }
}