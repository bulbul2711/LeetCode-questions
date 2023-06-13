class Solution {
    public int equalPairs(int[][] grid) {
       
        HashMap<String,Integer> map=new HashMap<>();
        int c=0;
        
        for(int i=0;i<grid.length;i++){
             String sb="";
            for(int j=0;j<grid.length;j++){
                sb+=grid[i][j];
                 sb+=",";
            }
            map.put(sb,map.getOrDefault(sb,0)+1);
          
        }
        
        for(int k=0;k<grid.length;k++){
            String sb1="";
            for(int l=0;l<grid.length;l++){
                sb1+=grid[l][k];
                 sb1+=",";
            }
            if(map.containsKey(sb1))
                c+=map.get(sb1);
        }
        return c;
    }
}