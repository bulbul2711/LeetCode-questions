class Solution {
    public boolean halvesAreAlike(String s) {
        int l = s.length();
        String a=s.substring(0,l/2);
         String b=s.substring(l/2);
        if(countVowel(a)==countVowel(b))
            return true;
        else 
            return false;
    }
    int countVowel(String s){
        s=s.toUpperCase();int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                c++;
        }
        return c;
    }
}