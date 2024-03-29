class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int x=reverse(nums[i]);
            if(!hs.contains(x))
                hs.add(x);
        }
        return hs.size();
    }
    public int reverse(int n){
        int rem=0;
        while(n>0){
            int d=n%10;
            rem=rem*10+d;
            n/=10;
        }
        return rem;
    }
}