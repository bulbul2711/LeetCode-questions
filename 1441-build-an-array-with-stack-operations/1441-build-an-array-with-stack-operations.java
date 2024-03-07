class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        int curr=1;
        for(int i=0;i<target.length;i++){
            while(curr<target[i]){
                res.add("Push");
                res.add("Pop");
                curr++;
            }
            res.add("Push");
            curr++;
        }
        return res;
    }
}