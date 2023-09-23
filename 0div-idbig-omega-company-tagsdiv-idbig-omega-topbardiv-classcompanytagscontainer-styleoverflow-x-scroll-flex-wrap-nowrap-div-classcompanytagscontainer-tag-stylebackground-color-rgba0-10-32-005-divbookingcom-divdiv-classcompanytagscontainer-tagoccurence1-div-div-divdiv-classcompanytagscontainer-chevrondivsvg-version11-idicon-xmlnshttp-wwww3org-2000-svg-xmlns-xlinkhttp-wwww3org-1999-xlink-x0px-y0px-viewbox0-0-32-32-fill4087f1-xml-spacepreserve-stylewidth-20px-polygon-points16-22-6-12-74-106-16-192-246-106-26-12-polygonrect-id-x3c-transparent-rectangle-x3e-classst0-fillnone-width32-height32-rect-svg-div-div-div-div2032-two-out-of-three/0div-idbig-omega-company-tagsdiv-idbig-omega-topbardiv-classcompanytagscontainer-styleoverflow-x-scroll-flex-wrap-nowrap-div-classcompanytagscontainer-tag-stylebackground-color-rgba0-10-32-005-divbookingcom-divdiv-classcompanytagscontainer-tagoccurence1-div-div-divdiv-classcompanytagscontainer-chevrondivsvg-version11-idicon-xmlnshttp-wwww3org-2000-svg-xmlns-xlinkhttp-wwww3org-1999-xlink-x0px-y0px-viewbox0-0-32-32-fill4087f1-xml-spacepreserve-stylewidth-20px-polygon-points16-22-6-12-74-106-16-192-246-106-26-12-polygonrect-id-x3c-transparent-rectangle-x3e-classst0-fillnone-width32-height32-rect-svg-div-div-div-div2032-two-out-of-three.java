class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
            a1.add(nums2[i]);
        for(int i=0;i<nums3.length;i++)
            a2.add(nums3[i]);
        for(int i=0;i<nums1.length;i++){
            if(!res.contains(nums1[i]) && (a1.contains(nums1[i]) || a2.contains(nums1[i])))
               res.add(nums1[i]);
        }
        for(int i=0;i<a2.size();i++){
            int x=a2.get(i);
            if(!res.contains(x) && a1.contains(x))
                res.add(x);
        }
        return res;
    }
}