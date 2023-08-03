class Solution {
    public List<String> letterCombinations(String digits) {
        
         List<String> res=new ArrayList<>();
         String str="";
         HashMap<Character,String> map=new HashMap<>();
         map.put('2',"abc");
         map.put('3',"def");
         map.put('4',"ghi");
         map.put('5',"jkl");
         map.put('6',"mno");
         map.put('7',"pqrs");
         map.put('8',"tuv");
         map.put('9',"wxyz");
        if(digits.length()==0)
            return res;
        dfs(digits,0,map,str,res);
        return res;
    }
    public void dfs(String digits,int index,HashMap<Character,String> map,String str,List<String> res){
        if(str.length()==digits.length()){
            res.add(str);
            return;  //backtrack
        }
        String s=map.get(digits.charAt(index));
        for(int i=0;i<s.length();i++){
            dfs(digits, index+1, map, str+s.charAt(i), res);
        }
    }
}