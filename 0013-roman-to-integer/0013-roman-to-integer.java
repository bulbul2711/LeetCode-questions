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
        num+=map.get(s.charAt(0));
        for(int i=1;i<n;i++){
            int a=map.get(s.charAt(i));
            int b=map.get(s.charAt(i-1));
            num+=a;
            if(b<a)
               num-=(2*b);
        }
        return num;
    }
}