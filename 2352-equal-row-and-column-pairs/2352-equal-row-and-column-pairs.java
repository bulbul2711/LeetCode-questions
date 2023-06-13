class Solution {
    public int equalPairs(int[][] grid) {
       
        HashMap<String,Integer> map=new HashMap<>();
        int c=0;
         
        for(int i=0;i<grid.length;i++){
            StringBuffer sb=new StringBuffer();
            for(int j=0;j<grid.length;j++){
                sb.append(grid[i][j]);
                 sb.append(",");
            }
            System.out.println(sb);
            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
           // sb.delete(0,sb.length());
        }
        
        for(int k=0;k<grid.length;k++){
            StringBuffer sb1=new StringBuffer();
            for(int l=0;l<grid.length;l++){
                sb1.append(grid[l][k]);
                 sb1.append(",");
            }
              System.out.println(sb1);
            if(map.containsKey(sb1.toString()))
                c+=map.get(sb1.toString());
              System.out.println(c);
              // sb1.delete(0,sb1.length());
        }
        return c;
    }
}