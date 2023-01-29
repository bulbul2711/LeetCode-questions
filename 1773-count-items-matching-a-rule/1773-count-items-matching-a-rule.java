class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res=0;
        if(ruleKey.equals("type"))
        {
            for(int i=0;i<items.size();i++)
                if(items.get(i).get(0).equals(ruleValue))
                    res++;
        }
        
        else if(ruleKey.equals("color"))
        {
            for(int i=0;i<items.size();i++)
                if(items.get(i).get(1).equals(ruleValue))
                    res++;
        }
        else
            {
            for(int i=0;i<items.size();i++)
                if(items.get(i).get(2).equals(ruleValue))
                    res++;
            }
          return res;  
    }
}