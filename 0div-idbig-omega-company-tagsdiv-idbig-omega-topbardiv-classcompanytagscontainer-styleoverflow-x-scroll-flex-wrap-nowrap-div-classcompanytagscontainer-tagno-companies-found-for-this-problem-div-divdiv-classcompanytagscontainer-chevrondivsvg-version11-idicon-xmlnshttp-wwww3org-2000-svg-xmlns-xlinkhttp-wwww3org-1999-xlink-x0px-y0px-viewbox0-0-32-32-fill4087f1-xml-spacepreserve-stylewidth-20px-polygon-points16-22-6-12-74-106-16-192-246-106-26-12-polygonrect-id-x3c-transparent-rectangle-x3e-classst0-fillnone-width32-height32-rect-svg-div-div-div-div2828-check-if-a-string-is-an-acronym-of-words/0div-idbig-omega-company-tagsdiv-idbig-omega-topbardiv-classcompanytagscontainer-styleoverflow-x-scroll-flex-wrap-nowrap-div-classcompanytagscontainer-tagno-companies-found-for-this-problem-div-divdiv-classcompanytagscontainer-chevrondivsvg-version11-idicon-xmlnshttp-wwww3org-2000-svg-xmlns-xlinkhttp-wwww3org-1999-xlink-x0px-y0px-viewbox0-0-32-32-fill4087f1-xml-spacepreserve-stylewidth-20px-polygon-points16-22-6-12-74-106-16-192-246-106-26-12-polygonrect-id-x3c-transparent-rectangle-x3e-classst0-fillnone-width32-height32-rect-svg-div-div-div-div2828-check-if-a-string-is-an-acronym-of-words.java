class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<words.size();i++){
            sb.append(words.get(i).charAt(0));
        }
        return sb.toString().equals(s);
    }
}