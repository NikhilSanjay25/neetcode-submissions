class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int max = 0;
        int r = heights.length-1;
        while(l<r){
            max = Math.max(max,(r-l)*Math.min(heights[r],heights[l]));
            if(heights[r]>heights[l]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
