import java.util.Deque;
import java.util.LinkedList;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] res = new int[length];
        Deque<Integer> stack = new LinkedList<>();
        for(int i = 0; i < length; i++) {
            int temperature = temperatures[i];
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperature) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return res;
    }
}
