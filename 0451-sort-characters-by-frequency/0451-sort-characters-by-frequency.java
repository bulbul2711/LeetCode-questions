class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Map<Integer,List<Character>> cmap=new HashMap<>();
        List<Integer> list2=new ArrayList<>();
        for(char ch:map.keySet()){
            int x=map.get(ch);
            if(!cmap.containsKey(x))
                cmap.put(x,new ArrayList<>());
            cmap.get(x).add(ch);
            if(!list2.contains(x))
                list2.add(x);
        }
        Collections.sort(list2,Collections.reverseOrder());
        StringBuilder sb=new StringBuilder();
        int n=0;
        for(int i=0;i<list2.size();i++){
            List<Character> l=new ArrayList<>();
            l=cmap.get(list2.get(i));
            for(int j=0;j<l.size();j++){
                n=list2.get(i);
                while(n>0){
                    sb.append(l.get(j));
                    n--;
                }
            }
        }
        return sb.toString();
    }
}