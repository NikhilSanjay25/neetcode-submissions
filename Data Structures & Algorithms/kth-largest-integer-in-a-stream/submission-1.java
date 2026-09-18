class KthLargest {
    PriorityQueue<Integer> op;
    int k1;
    public KthLargest(int k, int[] nums) {
        op = new PriorityQueue<>();
        k1 = k;
        for(int i:nums){
            op.add(i);
        }
        while(op.size()>k1){
            op.poll();
        }
    }
    
    public int add(int val) {
        op.add(val);
        while(op.size()>k1){
            op.poll();
        }
        Integer a = op.peek();
        return a;
    }
}
