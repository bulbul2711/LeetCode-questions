class Solution {
    public int maximumUnits(int[][] box, int truckSize) {
        Arrays.sort(box,Comparator.comparingInt(x->-x[1]));
        int i=0,res=0;
        while(i<box.length && truckSize>0){
            if(box[i][0]<truckSize){
                res+=box[i][0]*box[i][1];
                truckSize-=box[i][0];
            }
            else{
                if(truckSize!=0){
                    res+=truckSize*box[i][1];
                    truckSize=0;
                }
            }
            i++;
        }
        return res;
    }
}