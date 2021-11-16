import java.util.HashMap;

public class FirstUniqChar {
    public char firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(hashMap.get(c) == 1){
                return c;
            }
        }
        return ' ';
    }
}
