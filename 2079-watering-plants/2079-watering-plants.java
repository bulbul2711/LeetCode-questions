class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int step=1;
        int c=capacity;
        capacity-=plants[0];
        for(int i=0;i<plants.length-1;i++){
            if(plants[i+1]<=capacity){
                step++;
                capacity-=plants[i+1];
            }
            else{
                step+=(2*i)+3;
                capacity=c-plants[i+1];
            }
        }
        return step;
    }
}