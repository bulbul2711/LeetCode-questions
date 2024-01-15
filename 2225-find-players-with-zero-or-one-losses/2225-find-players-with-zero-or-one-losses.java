class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses=new int[100001];
        List<Integer> zero=new ArrayList<>();
          List<Integer> one=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            int win=matches[i][0];
            int loss=matches[i][1];
            if(losses[win]==0)
                losses[win]=-1;//taaki jo numbers h hi ni matches me woh na aay ans me
            if(losses[loss]==-1)
                losses[loss]=1;
            else
                losses[loss]++;
        }
        for(int i=0;i<losses.length;i++){
            if(losses[i]==-1)
                zero.add(i);
            else if(losses[i]==1)
                one.add(i);
        }
        ans.add(zero);
        ans.add(one);
        return ans;
    }
}