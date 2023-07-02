class Solution {
    public String intToRoman(int num) {
        // HashMap<String,Integer> map=new LinkedHashMap<>();
        // map.put("M",1000);
        // map.put("CM",900);
        // map.put("D",500);
        // map.put("CD",400);
        // map.put("C",100);
        // map.put("XC",90);
        // map.put("L",50);
        // map.put("XL",40);
        // map.put("X",10);
        // map.put("IX",9);
        // map.put("V",5);
        // map.put("IV",4);
        // map.put("I",1);
        // String s="";
        // for(String key : map.keySet()){
        //     while(num>=map.get(key)){
        //         s+=key;
        //         num-=map.get(key);
        //     }
        // }
        // return s;
        
        StringBuffer s=new StringBuffer();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                s.append(strs[i]);
                num-=values[i];
            }
        }
        return s.toString();
    }
}