class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int water=1;
        int l=0,r=height.length-1;
        while(l<r){
            water=(r-l)*Math.min(height[l],height[r]);
            max=Math.max(max,water);
            if(height[l]<=height[r])
                l+=1;
            else
                r-=1;
        }
        return max;
    }
}