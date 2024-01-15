class Solution {
    public int equalPairs(int[][] grid) {
       
        HashMap<String,Integer> map=new HashMap<>();
        int c=0; 
        for(int i=0;i<grid.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<grid.length;j++){
                sb.append(grid[i][j]);
                 sb.append(",");
            }
            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
        }
        for(int k=0;k<grid.length;k++){
            StringBuilder sb1=new StringBuilder();
            for(int l=0;l<grid.length;l++){
                sb1.append(grid[l][k]);
                 sb1.append(",");
            }
            if(map.containsKey(sb1.toString()))
                c+=map.get(sb1.toString());
        }
        return c;
    }
}