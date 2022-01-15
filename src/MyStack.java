package src;

/**
 * Stack of integer class
 * @author Yannis Sauzeau
 */
public class MyStack {

    private int value;
    private MyStack previous;

    private MyStack(MyStack tail, int head) {
        this.value = head;
        this.previous = tail;
    }

    public MyStack() {
        this(null, 0);
    }
    
    /** 
     * Push the value on the stack
     * 
     * @param value  The value to push
     */
    public void push(int value) {
        this.previous = new MyStack(this.previous, this.value);
        this.value = value;
    }
    
    /** 
     * Pop all the values and put the on a string
     * 
     * @return String  The values pop
     */
    public String popAll() {
        String result = "";
        while (this.previous != null)
            result += pop() + ", ";
        return result.substring(0, result.length() - 2);
    }

    /**
     * Clear the stack
     */
    public void clear() {
        while (this.previous != null) 
            pop();
    }
    
    private int pop() {
        int top = this.value;
        this.value = this.previous.value;
        this.previous = this.previous.previous;

        return top;
    }
    
}
