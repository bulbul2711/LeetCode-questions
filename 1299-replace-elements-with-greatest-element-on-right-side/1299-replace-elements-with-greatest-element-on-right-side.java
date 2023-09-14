class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                max=Math.max(max,arr[j]);
            }
            res[i]=max;
        }
        res[arr.length-1]=-1;
        return res;
    }
}