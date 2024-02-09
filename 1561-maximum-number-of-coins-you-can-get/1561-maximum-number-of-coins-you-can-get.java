class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res=0;
        int x=piles.length-2;
        for(int i=0;i<piles.length/3;i++){
            res+=piles[x];
            x-=2;
        }
        return res;
    }
}