class Solution {
    public double average(int[] salary) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=salary.length;
        double avg=0.0;
        for(int i=0;i<n;i++){
            max=Math.max(salary[i],max);
            min=Math.min(salary[i],min);
        }
        for(int i=0;i<n;i++){
            if(salary[i]!=max && salary[i]!=min)
               avg+=salary[i];
        }
        return avg/(n-2);
    }
}