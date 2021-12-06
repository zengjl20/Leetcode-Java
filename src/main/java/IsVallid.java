import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class IsVallid {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(stack.peek() != map.get(s.charAt(i))) return false;
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
