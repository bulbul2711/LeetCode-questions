class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        
        //video dekh ke kiya
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(String s:words){
            char ch[]=s.toCharArray();
            for(int i=0;i<ch.length;i++){
                if(ch[i]!=separator){
                    sb.append(ch[i]);
                    if(i==ch.length-1){
                        list.add(sb.toString());
                        sb.setLength(0);
                    }
                }
                else{
                    if(sb.length()==0)
                        continue;
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        return list;
    }
}