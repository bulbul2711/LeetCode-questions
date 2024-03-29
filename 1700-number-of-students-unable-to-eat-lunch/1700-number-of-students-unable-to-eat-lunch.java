class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        List<Integer> st=new ArrayList<>();
        List<Integer> sa=new ArrayList<>();
        for(int i=0;i<students.length;i++){
            st.add(students[i]);
            sa.add(sandwiches[i]);
        }
       while(st.size()>0){
           if(st.get(0)==sa.get(0)){
               st.remove(0);
               sa.remove(0);
           }
           else{
               if(st.contains(sa.get(0))){
                   st.add(st.get(0));
                   st.remove(0);
               }
               else
                   break;
           }
       }
        return st.size();
    }
}