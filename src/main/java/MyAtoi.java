import java.util.ArrayList;
import java.util.List;

public class MyAtoi {
    public int myAtoi(String s) {
        boolean flag = true;
        List<Long> list = new ArrayList<>();
        s = s.trim();
        Long sum = 0l;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(i == 0 && c == '+') continue;
            else if(i == 0 && c == '-') flag = false;
            else if(Character.isDigit(c)) {
                sum = sum * 10 + (c - '0');
            }
            else break;
        }
        if(!flag) sum *= -1;
        Long min = Long.valueOf(Integer.MIN_VALUE);
        Long max = Long.valueOf(Integer.MAX_VALUE);
        if(sum < min) return min.intValue();
        if(sum > max) return max.intValue();
        return sum.intValue();
    }
}
