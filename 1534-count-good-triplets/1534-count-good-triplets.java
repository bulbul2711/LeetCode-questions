class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        //Arrays.sort(arr);
        // int count=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=i+1;j<arr.length;j++)
        //         for(int k=j+1;k<arr.length;k++)
        //     if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c)
        //         count++;
        // }
        // return count;
        
   //USING SLIDING WINDOW TECHNIQUE
        int i=0;int j=i+1;int k=j+1;int res=0;
        while(i+2<arr.length)
        {
            if(check(arr,i,j,k,a,b,c))
                res++;
            if(k<arr.length)
                k++;
            if(k==arr.length)
            {
                j++;
                k=j+1;
            }
            if(j+1==arr.length)
            {
                i++;
                j=i+1;
                k=j+1;
            }
        }
        return res;
    }
    
    boolean check(int arr[],int i,int j,int k,int a,int b,int c)
    {
     return(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c);
            
    }
}