class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minR=m,minC=n;
        for(int i=0;i<ops.length;i++){
            if(ops[i][0]<minR)
                minR=ops[i][0];
            if(ops[i][1]<minC)
                minC=ops[i][1];
        }
        return minR*minC;
    }
}