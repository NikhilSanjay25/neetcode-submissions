class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int ret = 0;
        while(l<r){
            ret = Math.max(ret,Math.min(heights[l],heights[r])*(r-l));
            if(heights[l]>heights[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return ret;
    }
}
