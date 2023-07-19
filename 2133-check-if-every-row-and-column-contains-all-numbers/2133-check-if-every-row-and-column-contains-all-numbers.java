class Solution {
    public boolean checkValid(int[][] matrix) {
       HashSet<Integer> hs=new HashSet<>();
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                hs.add(matrix[i][j]);
            }
            if(hs.size()!=n)
                return false;
            for(int j=0;j<n;j++){
                if(hs.contains(matrix[j][i]))
                    hs.remove(matrix[j][i]);
            }
            if(hs.size()!=0)
                return false;
        }
        return true;
    }
}