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
           System.out.println(sb+" ");
            map.put(sb,map.getOrDefault(sb,0)+1);
            
            //System.out.print(sb);
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
        // for(Map.Entry<StringBuffer,Integer> entry:map.entrySet()){
        //     System.out.println(entry.getKey()+":"+entry.getValue());
        // }
        return c;
    }
}