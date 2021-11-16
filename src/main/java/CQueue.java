import java.util.Stack;

public class CQueue {
    private Stack<Integer> stack;
    private Stack<Integer> stack1;

    public CQueue() {
        stack = new Stack<Integer>();
        stack1 = new Stack<Integer>();
    }

    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        if (stack1.isEmpty()){
            while (!stack.isEmpty()){
                stack1.push(stack.pop());
            }
        }
        if(stack1.isEmpty()){
            return -1;
        }
        return stack1.pop();
    }
}
