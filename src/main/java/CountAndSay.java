import java.util.LinkedList;
import java.util.Queue;

public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n - 1);
        StringBuilder res = new StringBuilder();
        int start = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i != s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                continue;
            } else {
                res.append(i - start + 1);
                res.append(s.charAt(i));
                start = i + 1;
            }
        }
        return res.toString();
    }
}
