class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            String str=arr[i];
            if(str!=" " && str!=""){
                sb.append(str);
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}