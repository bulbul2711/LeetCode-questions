class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
                hmap.put(nums1[i],hmap.getOrDefault(nums1[i],0)+1);
        }
          for(int i=0;i<nums2.length;i++){
              if(hmap.containsKey(nums2[i]) && hmap.get(nums2[i])>0){
                  al.add(nums2[i]);
                  hmap.put(nums2[i],hmap.get(nums2[i])-1);
              }
          }
        int res[]=new int[al.size()];
        for(int i=0;i<al.size();i++){
            res[i]=al.get(i);
        }
       return res;
    }
}