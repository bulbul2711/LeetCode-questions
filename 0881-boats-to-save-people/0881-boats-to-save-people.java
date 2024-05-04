class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0,r=people.length-1;
        int sum=0,c=0;
        while(l<=r){
            sum=people[l]+people[r];
            if(sum>limit)
                r--;         //and count one boat for it because if it cannot be paired with the lightest weight person then it need to travel alone  
            else{
                l++;
                r--;
            }
          c++;      
        }
        return c;
}
}