class Solution {
    public String sortSentence(String s) {
        String str="";char a='0';
        String arr[]= s.split(" ");
        for(int i=0;i<arr.length;i++){
            a++;
           for(int j=0;j<arr.length;j++){
            String s1=arr[j];
            if(s1.charAt(s1.length()-1) ==a){
                str+=s1.substring(0,s1.length()-1);
                str+=" ";
        }
        
    }
        }
        return str.trim();
}
}