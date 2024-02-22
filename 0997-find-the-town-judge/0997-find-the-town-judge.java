class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1)
            return 1;
        // int[] a=new int[n+1];
        // for(int i=0;i<trust.length;i++){
        //     a[trust[i][1]]++;
        //     a[trust[i][0]]--;
        // }
        // Arrays.sort(a);
        // for(int i=0;i<a.length;i++)
        //     System.out.print(a[i]+" ");
        // if(a[n]==n-1)
        //     return trust[0][1];
        // else
        //     return -1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<trust.length;i++){
            int x=trust[i][1];
            int y=trust[i][0];
            map.put(x,map.getOrDefault(x,0)+1);
            map.put(y,map.getOrDefault(y,0)-1);
        }
        for(int x:map.keySet()){
            if(map.get(x)==n-1)
                return x;
        }
        return -1;
    }
}