class Solution {
    public int[] finalPrices(int[] prices) {
       /* for(int i=0;i<prices.length;i++)
        {
             for(int j=i+1;j<prices.length;j++)
                 if(prices[j]<=prices[i])
                 {
                     prices[i]-=prices[j];break;
                 }
        }
        return prices;*/
        
        //Monotonic stack
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
                prices[st.pop()]-=prices[i];
            }
            st.push(i);
        }
        return prices;
    }
}