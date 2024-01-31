class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                char ch=boxes.charAt(j);
                if(j!=i && ch=='1')
                    c+=Math.abs(j-i);
            }
            res[i]=c;
        }
        return res;
    }
}