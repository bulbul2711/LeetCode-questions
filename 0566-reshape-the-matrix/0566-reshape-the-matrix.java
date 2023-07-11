class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c)
            return mat;
        int res[][]=new int[r][c];
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                al.add(mat[i][j]);
            }
        }
        int a=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=al.get(a++);
            }
        }
        return res;
    }
}