class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<strs.length;i++){
            if(isDigit(strs[i]))
                ans=Integer.parseInt(strs[i]);
            else
                ans=strs[i].length();
            max=Math.max(ans,max);
        }
        return max;
    }
    boolean isDigit(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                return false;
        }
        return true;
    }
}