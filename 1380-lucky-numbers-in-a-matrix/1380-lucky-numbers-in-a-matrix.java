class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int min=Integer.MAX_VALUE;int col=-1;
        List<Integer> al=new ArrayList<>();
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
               if(min>matrix[i][j]){
                   min=matrix[i][j];
                   col=j;
               }
           }
           for(int j=0;j<matrix.length;j++){
               if(matrix[j][col]>matrix[i][col]){
                   col=-1;
                   break;
               }
           }
           if(col!=-1)
           al.add(matrix[i][col]);
           min=Integer.MAX_VALUE;
       }
        return al;
    }
}