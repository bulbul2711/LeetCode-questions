class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int l=0,r=s.length()-1;
       while(l<r){
           while(l<r && !isVowel(arr[l]))
               l++;
           while(l<r && !isVowel(arr[r]))
               r--;
           if(isVowel(arr[l]) && isVowel(arr[r])){
               char temp=arr[l];
               arr[l]=arr[r];
               arr[r]=temp;
               l++;
               r--;
           }
       }
        return String.copyValueOf(arr);
    }
    boolean isVowel(char ch){
        return (ch=='a' || ch=='A'
           || ch=='e' || ch=='E'
           || ch=='i' || ch=='I'
           || ch=='o' || ch=='O'
           || ch=='u' || ch=='U');
    }
}