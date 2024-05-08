class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(score[i]);
        Arrays.sort(score);
        String[] ans=new String[n];
        for(int i=n-1;i>=0;i--){
            int x=list.indexOf(score[i]);
            if(i==n-1)
                ans[x]="Gold Medal";
            else if(i==n-2)
                ans[x]="Silver Medal";
            else if(i==n-3)
                ans[x]="Bronze Medal";
            else
                ans[x]=Integer.toString(n-i);
        }
        return ans;
    }
}