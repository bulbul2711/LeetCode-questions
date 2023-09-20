class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> hs=new HashSet<>();
        for(int i=0;i<emails.length;i++){
            int ind=emails[i].indexOf("@");
            String str=emails[i],s1="";
            String s2=str.substring(ind);
            for(int j=0;j<ind;j++){
                char ch=str.charAt(j);
                if(ch=='.')
                    continue;
                else if(ch=='+')
                    break;
                else
                    s1+=ch;
            }
            hs.add(s1+s2);
        }
        return hs.size();
    }
}