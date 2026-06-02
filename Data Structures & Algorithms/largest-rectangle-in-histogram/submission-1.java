class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayList<Integer> stack = new ArrayList<>();
        int max = 0;
        for(int i=0;i<=heights.length;i++){
            int curr = (i==heights.length) ? 0:heights[i];
            while(!stack.isEmpty() && heights[stack.get(stack.size() - 1)]>curr){
                int idx = stack.remove(stack.size() - 1);
                int height = heights[idx];
                int left =stack.isEmpty() ? -1:stack.get(stack.size() - 1);
                int width = i - left - 1;
                max = Math.max(max, height * width);
            }
            stack.add(i);
        }
        return max;
    }
}
