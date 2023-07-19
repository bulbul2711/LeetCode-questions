class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;int sum=0;
        int a1[]=new int[n];
        int a2[]=new int[n];
        Arrays.fill(a1,1);
        Arrays.fill(a2,1);
        for(int i=1;i<n;i++){
            if(ratings[i-1]<ratings[i])
                a1[i]=a1[i-1]+1;
        }
        for(int i=n-1;i>0;i--){
            if(ratings[i-1]>ratings[i])
                a2[i-1]=a2[i]+1;
        }
        for(int i=0;i<n;i++)
            sum+=Math.max(a1[i],a2[i]);
        return sum;
    }
}