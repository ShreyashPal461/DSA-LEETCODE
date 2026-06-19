class MyQueue {
    Stack<Integer> st = new Stack<>();
    public MyQueue() {        
    }
    public void push(int x) {
        st.push(x);
        
    }
    public int pop() {
     int x = st.pop();
     if(st.isEmpty()){
        return x;
    }  
     int res= pop();
     st.push(x);
     return res; 
    }
    
    public int peek() {
        int x = st.pop();
        if(st.isEmpty()){
            st.push(x);
            return x;
        }
        int res = peek();
        st.push(x);
        return res;
        
    }
    
    public boolean empty() {
        if(st.isEmpty()) return true;
        else return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */