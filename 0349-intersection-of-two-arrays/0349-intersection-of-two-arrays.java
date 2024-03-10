class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i]))
                map.put(nums1[i],map.get(nums1[i])+1);
            else
                map.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                al.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }
        int a[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
            a[i]=al.get(i);
        return a;
       }
    }
