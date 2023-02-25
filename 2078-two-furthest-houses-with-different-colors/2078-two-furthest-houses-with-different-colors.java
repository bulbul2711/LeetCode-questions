class Solution {
    public int maxDistance(int[] colors) {
        int a=0;int max=0;
        int b=colors.length-1;
        for(int i=0;i<colors.length;i++){
            if(colors[a]!=colors[i]){
                max=Math.max(max,Math.abs(i-a));
            }
             if(colors[b]!=colors[i]){
                max=Math.max(max,Math.abs(i-b));
        }
        }
        return max;
    
}
}