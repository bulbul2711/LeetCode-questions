class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        // int ar[][] = new int[image.length][image[0].length];
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[0].length;j++)
        //         ar[i]
        return flip(image);
        
    }
    int[][] flip(int[][] arr)
    {
         for(int i=0;i<arr.length;i++)
         {
             int start=0;
             int end=arr.length-1;
             while(start<end)
             {
                 int temp=arr[i][start];
                 arr[i][start]=arr[i][end];
                 arr[i][end]=temp;
                 
                 start++;
                 end--;
             }
         }
        int a[][] = invert(arr);
        return a;
    }
    int[][] invert(int[][] arr)
    {
        int a[][]=new int[arr.length][arr[0].length];
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                    res=1;
                else
                    res=0;
            a[i][j] = res;
        }
        }
        return a;
    }
}