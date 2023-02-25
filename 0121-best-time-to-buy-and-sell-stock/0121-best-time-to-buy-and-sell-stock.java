class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],maxp=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min)
                min=prices[i];
                maxp=Math.max(maxp,prices[i]-min);
        }
        return maxp;
    }
}