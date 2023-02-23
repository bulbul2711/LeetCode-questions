class Solution {
    public String reversePrefix(String word, char ch) {
      
        String res="";int ind=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                ind=i;
                break;
            }
        }
        if(ind!=-1){
        res=reverse(word,0,ind)+word.substring(ind+1);
        return res;
    }
        else
            return word;
}
    
    String reverse(String str,int i,int j){
        StringBuffer sb=new StringBuffer();
        for(int k=j;k>=i;k--)
            sb.append(str.charAt(k));
        return sb.toString();
    }
}