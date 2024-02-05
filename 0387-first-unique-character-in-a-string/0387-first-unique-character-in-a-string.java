// class Solution {
//     public int firstUniqChar(String s) {
//         // int[] a=new int[26];
//         // for(int i=0;i<s.length();i++){
//         //     char ch=s.charAt(i);
//         //     a[ch-'a']++;
//         // }
//         // for(int i=0;i<s.length();i++){
//         //     char ch=s.charAt(i);
//         //     if(a[ch-'a']==1)
//         //         return i;
//         // }
//         // return -1;
        
//          for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//              if(s.indexOf(ch)==s.lastIndexOf(ch))
//                  return i;
//          }
//         return -1;
//     }
// }

class Solution {
     public int firstUniqChar(String s) {
        // Stores lowest index / first index
        int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        for(char c='a'; c<='z';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index's which are occured once
            // but our answer is lowest index
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        return ans==Integer.MAX_VALUE?-1:ans;
    }   
}