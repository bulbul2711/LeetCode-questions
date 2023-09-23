class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            if(binary(i)==k)
                sum+=nums.get(i);
        }
        return sum;
    }
    int binary(int x){
        int c=0;
        while(x>0){
            if(x%2==1) c++;
            x/=2;
        }
        return c;
    }
}