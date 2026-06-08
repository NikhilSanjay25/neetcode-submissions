class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
PriorityQueue<ArrayList<Integer>> heap =
    new PriorityQueue<>((a, b) -> Integer.compare(b.get(0), a.get(0)));        for(int i=0;i<k-1;i++){
            ArrayList<Integer> op = new ArrayList<>();
            op.add(nums[i]);
            op.add(i);
            heap.offer(op);
        }
        int[] op = new int[nums.length-k+1];
        int l=0;
        for(int r=k-1;r<nums.length;r++){
            ArrayList<Integer> op1 = new ArrayList<>();
            op1.add(nums[r]);
            op1.add(r);
            heap.offer(op1);
            
            while(heap.peek().get(1)<=(r-k)){
                heap.poll();
            }
            op[l]=heap.peek().get(0);
            l++;
        }
        return op;
    }
}
