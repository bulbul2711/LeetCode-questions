class Solution {
    public int heightChecker(int[] heights) {
        int arr[]=new int[heights.length];
        int c=0;
        for(int i=0;i<heights.length;i++)
        arr[i]=heights[i];
        Arrays.sort(arr);
        
         for(int i=0;i<heights.length;i++)
             if(heights[i]!=arr[i]) c++;
        return c;
    }
}