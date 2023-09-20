class Solution {
    public int calPoints(String[] operations) {
       ArrayList<Integer> al = new ArrayList<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String str=operations[i];
            if(str.equals("+"))
                al.add(al.get(al.size()-1) + al.get(al.size()-2));
            else if(str.equals("D"))
                al.add(2*(al.get(al.size()-1)));
            else if(str.equals("C"))
                al.remove(al.size()-1);
            else
                al.add(Integer.parseInt(str));
        }
        for(int i=0;i<al.size();i++)
            sum+=al.get(i);
        return sum;
    }
}