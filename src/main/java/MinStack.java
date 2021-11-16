import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MinStack {

    private Deque<Integer> queue;
    private Deque<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        queue = new LinkedList<Integer>();
        min = new LinkedList<Integer>();
    }

    public void push(int x) {
        queue.push(x);
        if(min.isEmpty()){
            min.push(x);
        }else {
            if(min.peek() >= x){
                min.push(x);
            }
        }
    }

    public void pop() {
        int i = queue.pop();
        if(i == min.peek()){
            min.pop();
        }
    }

    public int top() {
        return queue.peek();
    }

    public int min() {
        return min.peek();
    }
}
