class Solution {
    public int maxCoins(int[] piles) {
        int max=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0;i<n;i++)
            max=Math.max(piles[i],max);
        int[] freq=new int[max+1];
        for(int i=0;i<n;i++){
            freq[piles[i]]++;
        }
        int choice=n/3;
        boolean flag=false;
        int i=max;
        int coin=0;
        while(choice>0){
            if(freq[i]>0){
                if(!flag)
                    flag=true;
                else{
                    choice--;
                    coin+=i;
                    flag=false;
                }
                freq[i]--;
            }
            else
                i--;
        }
        return coin;
    }
}