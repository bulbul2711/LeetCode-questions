class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
            list1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++)
            list2.add(nums2[i]);
        int c1=0,c2=0;
        for(int i=0;i<nums1.length;i++){
            if(list2.contains(nums1[i]))
                c1++;
        }
        for(int i=0;i<nums2.length;i++){
            if(list1.contains(nums2[i]))
                c2++;
        }
        return new int[]{c1,c2};
    }
}