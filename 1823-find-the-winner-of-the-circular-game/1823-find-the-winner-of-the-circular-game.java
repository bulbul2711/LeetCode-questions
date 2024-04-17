class Solution {
    public int findTheWinner(int n, int k) {
        LinkedList<Integer> list=new LinkedList<>();
        int lastKilled=0;
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<k-1;j++){
                list.add(list.poll());
            }
            lastKilled=list.poll();
        }
        return lastKilled;
    }
}