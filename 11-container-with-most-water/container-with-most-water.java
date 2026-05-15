class Solution {
    public int maxArea(int[] height) {
        int i = 0 , j = height.length - 1 , ma = 0;
        while(i<j){
            int w = j-i;
            int h = Math.min(height[i],height[j]);
            ma = Math.max(ma,w*h);
            if(height[i]<height[j]){
                i++;
            }
            else j--;
        }
        return ma;
    }
}