class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count[]={0,0};
        int n=students.length;int k=0;
        for(int i:students)
            count[i]++;
        for(k=0;k<n && count[sandwiches[k]]>0;k++){
            count[sandwiches[k]]--;
        }
        return n-k;  
    }
}