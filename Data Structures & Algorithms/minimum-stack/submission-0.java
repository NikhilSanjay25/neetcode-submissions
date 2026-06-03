class MinStack {
    Stack<Integer> op = new Stack<>();
    PriorityQueue<Integer> min = new PriorityQueue<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        op.push(val);
        min.add(val);
    }
    
    public void pop() {
        int val = op.pop();
        min.remove(val);
    }
    
    public int top() {
        return op.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
