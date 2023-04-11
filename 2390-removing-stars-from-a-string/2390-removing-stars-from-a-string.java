class Solution {
    public String removeStars(String s) {
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
               al.add(s.charAt(i));
            }
            else
                al.remove(al.size()-1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<al.size();i++)
            sb.append(al.get(i));
        return sb.toString();
    }
}