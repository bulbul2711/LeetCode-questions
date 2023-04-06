class Solution {
    public int minimumRecolors(String blocks, int k) {
        int r=k-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<blocks.length()-k+1;i++){
            int c=0;
            for(int j=i;j<=r;j++){
                if(blocks.charAt(j)=='W')
                    c++;
            }
            min=Math.min(min,c);
            r++;
        }
        return min;
    }
}