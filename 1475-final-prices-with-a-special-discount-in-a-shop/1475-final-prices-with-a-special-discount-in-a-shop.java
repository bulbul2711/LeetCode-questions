class Solution {
    public int[] finalPrices(int[] prices) {
        int res[]=new int [prices.length];
        for(int i=0;i<prices.length;i++)
        {
             for(int j=i+1;j<prices.length;j++)
                 if(prices[j]<=prices[i])
                 {
                     prices[i]-=prices[j];break;
                 }
            res[i]=prices[i];
        }
        return res;
    }
}