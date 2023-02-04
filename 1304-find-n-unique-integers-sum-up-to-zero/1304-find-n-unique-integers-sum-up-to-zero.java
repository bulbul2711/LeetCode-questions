class Solution {
    public int[] sumZero(int n) {
       int a[]=new int[n];int c=0;
        if(n%2==0)
        {
            for(int i=0;i<n-1;i+=2)
                {
                    a[i]=i+1;
                   a[i+1]=-(i+1);
                }
        }
        else
        {
            
            for(int i=0;i<n-1;i+=2)
                {
                    a[i]=i+1;
                   a[i+1]=-(i+1);
                }
            a[n-1]=0;
        }
        return a;
    }
}