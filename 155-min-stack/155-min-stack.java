class MinStack {
    List<Pair<Integer,Integer>> stack;
    
    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        if(stack.size()==0)
        stack.add(new Pair<Integer,Integer>(val,val));
         else {
             int min = stack.get(stack.size()-1).getValue();
             stack.add(new Pair<Integer,Integer>(val,Math.min(val,min)));
         }
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
    }
    
    public int top() {
       return stack.get(stack.size()-1).getKey();
    }
    
    public int getMin() {
        return stack.get(stack.size()-1).getValue();
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