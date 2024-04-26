class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    list.add(new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }
        for(int i=0;i<list.size();i++){
            set(list.get(i).get(0), list.get(i).get(1), m, n, matrix);
        }
    }
    public void set(int row, int col, int m, int n, int[][] matrix){
        for(int i=0;i<m;i++)
            matrix[i][col]=0;
        for(int i=0;i<n;i++)
            matrix[row][i]=0;
    }
}