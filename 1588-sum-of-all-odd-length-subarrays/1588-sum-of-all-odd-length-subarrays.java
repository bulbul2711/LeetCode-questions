class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length; int res=0;
        for(int i=0;i<n;i++)
        {
        int start=n-i;   //kitne subarray is index pe jo no.hai usse                            start honge
            
        int end=i+1;     //kitne subarray is index pe jo no.hai usse                            end honge
        int total=start*end;    //given array ke total kitne subarray                                     honge
        int odd=total/2;        //total me se kitne odd length ke                                      honge
        if(total%2 == 1)
            odd++;
        res+=odd*arr[i];
        }
        return res;
    }
    
}