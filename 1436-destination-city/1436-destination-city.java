class Solution {
    public String destCity(List<List<String>> paths) {
        String ans="";
        List<String> l=new ArrayList<>();
        List<String> r=new ArrayList<>();
        for(int i=0;i<paths.size();i++){
            l.add(paths.get(i).get(0));
            r.add(paths.get(i).get(1));
        }
        for(int i=0;i<r.size();i++){
            if(!l.contains(r.get(i)))
                ans= r.get(i);
        }
        return ans;
    }
}