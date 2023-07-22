class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int l=0,r=n-1;
        while(l<r){
            for(int i=0;i<n;i++){
                int temp1=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp1;
            }
            l++;
            r--;
        }
    }
}