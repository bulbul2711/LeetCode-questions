class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0,j=0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while(i<nums1.length && j<nums2.length){
            int x=nums1[i][0];
            int y=nums2[j][0];
            if(x<y){
                map.put(x,nums1[i][1]);
                i++;
            }
            else if(y<x){
                map.put(y,nums2[j][1]);
                j++;
            }
            else{
                map.put(x,nums1[i][1]+nums2[j][1]);
                i++;
                j++;
            }
        }
        while(i<nums1.length){
            map.put(nums1[i][0],nums1[i][1]);
            i++;
        }
        while(j<nums2.length){
            map.put(nums2[j][0],nums2[j][1]);
            j++;
        }
        int res[][] = new int[map.size()][2];
        int a=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            res[a][0]=entry.getKey();
            res[a][1]=entry.getValue();
            a++;
        }
       // Arrays.sort(res,Comparator.comparingInt(x->x[0]));
        return res;
    }
}