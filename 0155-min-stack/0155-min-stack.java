class MinStack {
    private Stack <Integer> Stack;
        private Stack <Integer> minStack;

    public MinStack() {
        Stack= new Stack<>();
        minStack= new Stack<>();

    }
    
    public void push(int val) {
        Stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    
    public void pop() {
        Stack.pop();
        minStack.pop();
        
    }
    
    public int top() {
        return Stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */