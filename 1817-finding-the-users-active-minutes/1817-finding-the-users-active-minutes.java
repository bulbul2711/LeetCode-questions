class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        Arrays.sort(logs, Comparator.comparingInt((int[] arr) -> arr[0]).thenComparingInt(arr -> arr[1]));

        map.put(logs[0][0],1);
        for(int i=1;i<logs.length;i++){
            if(logs[i][0]==logs[i-1][0] && logs[i][1]!=logs[i-1][1])
                map.put(logs[i][0],map.getOrDefault(logs[i][0],0)+1);
            else if(logs[i][0]!=logs[i-1][0])
                map.put(logs[i][0],map.getOrDefault(logs[i][0],0)+1);
        }
        int[] ans=new int[k];
        for(int i:map.values())
            ans[i-1]++;
        return ans;
    }
}