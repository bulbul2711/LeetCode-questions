class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq=new int[26];
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            freq[ch-'a']++;
        }
        int maxFreq=Integer.MIN_VALUE;
        for(int i=0;i<26;i++)
            maxFreq=Math.max(maxFreq,freq[i]);
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            if(ans.indexOf(s.charAt(i))==-1 && freq[s.charAt(i)-'a']==maxFreq)
               ans=s.charAt(i)+ans;
        }
        return ans;
    }
}