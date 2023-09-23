class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res=new ArrayList<>();
        boolean a[]=new boolean[101];
         boolean b[]=new boolean[101];
         boolean c[]=new boolean[101];
        
        for(int i=0;i<nums1.length;i++)
            a[nums1[i]]=true;
        for(int i=0;i<nums2.length;i++)
            b[nums2[i]]=true;
        for(int i=0;i<nums3.length;i++)
            c[nums3[i]]=true;
        
        for(int i=0;i<101;i++){
            if((a[i] || b[i]) && (b[i] || c[i]) && (c[i] || a[i]))
                res.add(i);
        }
        return res;
    }
}