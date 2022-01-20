import java.util.ArrayList;
import java.util.List;

public class Convert {
    public String convert(String s, int numRows) {
        List<List<Character>> list = new ArrayList<>(numRows);
        int ptr = 0, move = 1;
        for(int i = 0; i < s.length(); i++) {
            list.get(ptr).add(s.charAt(i));
            if(ptr == numRows - 1) {
                move = -1;
            }
            if(ptr == 0) move = 1;
            ptr += move;
        }
        StringBuilder res = new StringBuilder();
        for(List<Character> l : list) {
            for(Character c : l) {
                res.append(c);
            }
        }
        return res.toString();
    }
}
