import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backTrack(combinations, phoneMap, digits, 0, new StringBuilder());
        return combinations;
    }

    private void backTrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int i, StringBuilder combination) {
        if(digits.length() == i){
            combinations.add(combination.toString());
            return;
        }
        char digit = digits.charAt(i);
        String letters = phoneMap.get(digit);
        int len = letters.length();
        for(int j = 0; j < len; j++){
            combination.append(letters.charAt(j));
            backTrack(combinations, phoneMap, digits, i + 1, combination);
            combination.deleteCharAt(i);
        }
    }
}
