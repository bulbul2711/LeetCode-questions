class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].charAt(0)==words[j].charAt(1)){
                    if(words[i].charAt(1)==words[j].charAt(0)){
                        c++;
                        //j=words.length;
                        //System.out.println(words[i]);
                    }
                }
            }
        }
        return c;
    }
}