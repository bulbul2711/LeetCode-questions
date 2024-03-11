class Solution {
    public String customSortString(String order, String s) {
     int[] a=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<order.length();i++){
            char ch=order.charAt(i);
            if(s.indexOf(ch)!=-1){
                for(int j=0;j<a[ch-'a'];j++)
                    sb.append(ch);
                a[ch-'a']=0;
            }
        }
        for(int i=0;i<26;i++){
            if(a[i]>0){
                for(int j=0;j<a[i];j++)
                    sb.append((char)(97+i));
            }
        }
        return sb.toString();
    }
}