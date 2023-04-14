class MyQueue {

    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
         st1=new Stack<>();
         st2=new Stack<>();
    }
    
    public void push(int x) {
        this.st1.push(x);
    }
    
    public int pop() {
        int res=0;
        int n=st1.size()-1;
        for(int i=0;i<n;i++)
           st2.push(st1.pop());
        res=st1.pop();
        for(int j=0;j<n;j++)
            st1.push(st2.pop());
        return res;
    }
    
    public int peek() {
        return st1.get(0);
    }
    
    public boolean empty() {
      return st1.size()==0;  
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