class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev=null;
        List<Integer> curr=null;
        for(int i=0;i<=rowIndex;i++){
            curr=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    curr.add(1);
                else
                    curr.add(prev.get(j-1)+prev.get(j));
            }
            prev=curr;
        }
        return curr;
    }
}