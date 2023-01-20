class Solution {
    HashSet<List<Integer>> set;
    LinkedList<Integer> path;
    public List<List<Integer>> findSubsequences(int[] nums) {
        set= new HashSet();
        path=new LinkedList();
        findSubsequences(nums,0);
        return new ArrayList(set);
        
    }
    public void findSubsequences(int nums[],int index)
    {
        if(path.size()>1)
        {
            set.add(new ArrayList(path));
        }
        for(int i=index;i<nums.length;i++)
        {
            if(path.isEmpty() || path.get(path.size()-1) <= nums[i]){
            path.add(nums[i]);
            findSubsequences(nums,i+1);
            path.removeLast();
        }
        }
    }
}



