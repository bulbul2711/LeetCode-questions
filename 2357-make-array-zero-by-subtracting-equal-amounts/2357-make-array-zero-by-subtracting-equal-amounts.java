class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        set.remove(0); 
        return set.size();
    }
}