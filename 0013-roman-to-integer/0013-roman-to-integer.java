class Solution {
    public int romanToInt(String s) {
        int num=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=s.length();
        for(int i=0;i<n;i++){
            int a=map.get(s.charAt(i));
            num+=a;
            if(i>0 && map.get(s.charAt(i-1))<a)
                num-=(2*map.get(s.charAt(i-1)));
        }
        return num;
    }
}