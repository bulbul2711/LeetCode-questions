class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int sorted[]=score.clone();
        Arrays.sort(sorted);
        int rank=4;
        Map<Integer, String> map=new HashMap<>();
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                map.put(sorted[i], "Gold Medal");
            }
            else if(i==n-2){
                map.put(sorted[i], "Silver Medal");
            }
            else if(i==n-3){
                map.put(sorted[i], "Bronze Medal");
            }
            else{
                map.put(sorted[i], String.valueOf(rank++));
            }
        }
        String ans[]=new String[n];
        for(int i=0;i<n;i++){
            ans[i]=map.get(score[i]);
        }
        return ans;
    }
}