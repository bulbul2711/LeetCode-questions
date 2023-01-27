class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
//         for(int i=0;i<heights.length;i++)
//         {
//             for(int j=i+1;j<heights.length;j++)
//                 if(heights[i]<heights[j])
//                 {
//                     int temp=heights[i];
//                     heights[i]=heights[j];
//                     heights[j]=temp;
                    
//                     String temp1=names[i];
//                     names[i]=names[j];
//                     names[j]=temp1;
//                 }
                
//         }
//         return names;
        
        //USING HASHMAP
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<heights.length;i++)
         map.put(heights[i],names[i]);
        String arr[] = new String[heights.length];
        Arrays.sort(heights);
        
        int index=0;
        for(int j=heights.length-1;j>=0;j--)
            arr[index++]=map.get(heights[j]);
        return arr;
    }
}