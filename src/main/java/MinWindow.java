import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {
    public String minWindow(String s, String t) {
        int count = t.length();
        int left = 0, min = Integer.MAX_VALUE;
        String res = "";
        int[] letters = new int[58];
        boolean[] ifExist = new boolean[58];
        for(int i = 0; i < t.length(); i++) {
            letters[t.charAt(i) - 'A']++;
            ifExist[t.charAt(i) - 'A'] = true;
        }
        for(int j = 0; j < s.length(); j++) {
            if(letters[s.charAt(j) - 'A'] > 0) {
                count--;
            }
            letters[s.charAt(j) - 'A']--;
            while (count == 0) {
                if(ifExist[s.charAt(left) - 'A'] && letters[s.charAt(left) - 'A'] == 0) {
                    count++;
                }
                letters[s.charAt(left) - 'A']++;
                if(j - left + 1 < min) {
                    res = s.substring(left - 1, j + 1);
                    min = j - left + 1;
                }
                left++;
            }
        }
        return res;
    }
}
