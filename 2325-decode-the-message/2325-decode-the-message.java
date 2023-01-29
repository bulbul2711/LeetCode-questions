class Solution {
        public String decodeMessage(String key, String message)
        {
            String newstr="";
         HashMap<Character,Character> map = new HashMap<>();
            char ch='a';
            for(int i=0;i<key.length();i++)
            {
                if(key.charAt(i)==' ')
                    continue;
                if(!map.containsKey(key.charAt(i)))
                map.put(key.charAt(i),ch++);
            }
       
            for(int i=0;i<message.length();i++)
            {
               if(message.charAt(i)==' ')
                   newstr+=' ';
                else
                    newstr += map.get(message.charAt(i)); 
        
            }
            return newstr;
}
}