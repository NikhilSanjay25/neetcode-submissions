class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for(int i=0;i<k-1;i++){
            heap.offer(nums[i]);
        }
        int[] op = new int[nums.length-k+1];
        int l = 0;
        for(int r=k-1;r<nums.length;r++){
            heap.offer(nums[r]);
            op[l]=heap.peek();
            heap.remove(nums[l]);
            l++;
        }
        return op;
    }
}
