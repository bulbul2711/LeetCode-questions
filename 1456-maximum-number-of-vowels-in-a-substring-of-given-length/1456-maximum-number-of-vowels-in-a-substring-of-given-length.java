class Solution {
    public int maxVowels(String s, int k) {
        int max=Integer.MIN_VALUE;int c=0;
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                c++;
            }
            if(i>=k && isvowel(s.charAt(i-k)))
                c--;
            max=Math.max(max,c);
            }
            
        return max;
        }
         
    
    boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        else
            return false;
    }
}