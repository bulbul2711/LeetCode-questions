class Solution {
    public String[] shortestSubstrings(String[] arr) {
        String ans[] = new String[arr.length];
        int len = arr.length;
        Map<Integer,List<String>> m=new HashMap<>();
        for(int x=0;x<len;x++)
            ans[x]="";
        for(int i=0;i<len;i++){
            m.put(i,search(arr[i]));
        }
        for (int x = 0; x < len; x++) {
            List<String> l=m.get(x);
            for (int y = 0; y < l.size(); y++) {
                boolean flag = true;
                String str = l.get(y);
                for (int key : m.keySet()) {
                    if(key!=x){
                        List<String> l1=m.get(key);
                        if(l1.contains(str)){
                            flag=false;
                            break;
                        }
                    }
                }
                if(flag){
                    ans[x]=str;
                    break;
                }
            }
        }
            return ans;
    }
    public List<String> search(String str){
        int len=str.length();
        List<String> l=new ArrayList<>();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++)
                l.add(str.substring(i,j));
        }
        Collections.sort(l,Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        return l;
    }
}