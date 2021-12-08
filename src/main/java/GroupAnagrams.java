import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);
            if(hashMap.containsKey(sortedStr)){
                hashMap.get(sortedStr).add(str);
            }
            else {
                hashMap.put(sortedStr, new ArrayList<>(Arrays.asList(str)));
            }
        }
        List<List<String >> res = new ArrayList<>();
        for(List<String> value : hashMap.values()){
            res.add(value);
        }
        return res;
    }
}
