class MinStack {
    
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(val<=min){
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }
    
    public void pop() {
        int popEle= stack.pop();
        if(popEle==min){
            min=stack.pop();
        }
    }
    
    public int top() {
       return stack.peek(); 
    }
    
    public int getMin() {
        return min;
    }
}