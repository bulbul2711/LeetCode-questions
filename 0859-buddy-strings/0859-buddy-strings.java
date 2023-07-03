class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        int c=0;
        HashMap<Character,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int a=0;
       while(a<s.length()){
           if(s.charAt(a)!=goal.charAt(a)){
               list.add(a);
           }
           map.put(s.charAt(a),map.getOrDefault(s.charAt(a),0)+1);
           a++;
       }
        if(s.equals(goal)){
            for(char key:map.keySet())
                if(map.get(key)>1)
                    return true;
            return false;
        }
        else{
            if(list.size()!=2)
                return false;
            else{
                int pos1=list.get(0);
                int pos2=list.get(1);
                if(s.charAt(pos1)==goal.charAt(pos2) && s.charAt(pos2)==goal.charAt(pos1))
                    return true;
            }
        }
        return false;
    }
}