import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) {
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        int center = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            int len1 = maxLenAtI(s, i ,i);
            int len2 = maxLenAtI(s, i, i+1);
            int len = Math.max(len1, len2);
            if(maxLen < len){
                center = i;
                maxLen = len;
            }
        }
        return s.substring(center - maxLen / 2 + (maxLen + 1) % 2, center + maxLen / 2 + 1);
    }

    private int maxLenAtI(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        return end - start - 1;
    }
}
