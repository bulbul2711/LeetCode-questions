class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();
        q.offer(start);
        visited.add(start);
        while(!q.isEmpty()){
            int i=q.poll();
            if(arr[i]==0)
                return true;
            for(int j:new int[]{i+arr[i],i-arr[i]}){
                if(j>=0 && j<arr.length && !visited.contains(j)){
                    visited.add(j);
                    q.offer(j);
                }
            }
        }
        return false;
    }
}