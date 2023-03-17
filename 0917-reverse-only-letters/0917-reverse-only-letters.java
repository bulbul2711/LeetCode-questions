class Solution {
    public String reverseOnlyLetters(String s) {
       char a[]=s.toCharArray();
       int l=0,r=a.length-1;
        while(l<r){
            if(!Character.isLetter(a[l]))
                l++;
            else if(!Character.isLetter(a[r]))
                r--;
            else{
                char ch=a[l];
                a[l]=a[r];
                a[r]=ch;
                l++;
                r--;
            }
        }
        return String.valueOf(a);
    }
}