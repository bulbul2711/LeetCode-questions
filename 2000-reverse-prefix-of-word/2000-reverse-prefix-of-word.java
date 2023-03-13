class Solution {
    public String reversePrefix(String word, char ch) {
      int index=word.indexOf(ch);
        char a[]=word.toCharArray();
        if(index==-1)
            return word;
        else{
            int l=0,r=index;
           
            while(l<r){
                char ch3=a[l];
                a[l]=a[r];
                a[r]=ch3;
                l++;r--;
            }
          }
      return String.valueOf(a);
    }
}