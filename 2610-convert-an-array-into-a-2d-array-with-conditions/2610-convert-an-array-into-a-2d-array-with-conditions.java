class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(res.size()==0){
                List<Integer> list=new ArrayList<>();
                list.add(nums[i]);
            }
            for(int j=0;j<res.size();j++){
                if(!res.get(j).contains(nums[i])){
                    res.get(j).add(nums[i]);
                    a=-1;
                    break;
                }
            }
            if(a==0){
                List<Integer> l=new ArrayList<>();
                l.add(nums[i]);
                res.add(l);
            }
            a=0;  
        }
        return res;
    }
}