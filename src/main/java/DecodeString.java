import java.util.Collections;
import java.util.LinkedList;

public class DecodeString {
    int ptr;

    public String decodeString(String s) {
        LinkedList<String> stack = new LinkedList<>();
        ptr = 0;

        while (ptr < s.length()) {
            char cur = s.charAt(ptr);
            if (Character.isDigit(cur)) {
                // 获取一个数字并进栈
                String digits = getDigits(s);
                stack.addLast(digits);
            } else if (Character.isLetter(cur) || cur == '[') {
                // 获取一个字母并进栈
                stack.addLast(String.valueOf(s.charAt(ptr++)));
            } else {
                ++ptr;
                LinkedList<String> sub = new LinkedList<String>();
                while (!"[".equals(stack.peekLast())) {
                    sub.addLast(stack.removeLast());
                }
                Collections.reverse(sub);
                // 左括号出栈
                stack.removeLast();
                // 此时栈顶为当前 sub 对应的字符串应该出现的次数
                int repTime = Integer.parseInt(stack.removeLast());
                StringBuffer t = new StringBuffer();
                String o = getString(sub);
                // 构造字符串
                while (repTime-- > 0) {
                    t.append(o);
                }
                // 将构造好的字符串入栈
                stack.addLast(t.toString());
            }
        }
        return getString(stack);
    }

    public String getDigits(String s) {
        StringBuffer ret = new StringBuffer();
        while (Character.isDigit(s.charAt(ptr))) {
            ret.append(s.charAt(ptr++));
        }
        return ret.toString();
    }

    public String getString(LinkedList<String> v) {
        StringBuffer ret = new StringBuffer();
        for (String s : v) {
            ret.append(s);
        }
        return ret.toString();
    }

}
