class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        HashMap<Integer,Integer> winner=new HashMap<>();
         HashMap<Integer,Integer> loser=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            winner.put(matches[i][0],winner.getOrDefault(matches[i][0],0)+1);
            loser.put(matches[i][1],loser.getOrDefault(matches[i][1],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:winner.entrySet()){
            int a=entry.getKey();
            if(!loser.containsKey(a))
                l1.add(a);
        }
         for(Map.Entry<Integer,Integer> entry:loser.entrySet()){
            int a=entry.getKey();
             if(loser.get(a)==1)
                 l2.add(a);
        }
        ans.add(l1);
        ans.add(l2);
        for(int i=0;i<2;i++)
            Collections.sort(ans.get(i));
        return ans;
    }
}