import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int len = p.length();
        HashSet<String> set = reRank(p);
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i <= s.length() - len; i++){
            if(set.contains(s.substring(i, i + len))) res.add(i);
        }
        return res;
    }

    private HashSet<String> reRank(String p) {
        if(p.length() == 1){
            HashSet<String> set = new HashSet<>();
            set.add(p);
            return set;
        }
        int len = p.length();
        HashSet<String> set = reRank(p.substring(1));
        HashSet<String> newSet = new HashSet<>();
        for(String string : set){
            for(int i = 0; i < len; i++){
                newSet.add(string.substring(0, i) + p.charAt(0) + string.substring(i, len - 1));
            }
        }
        return newSet;
    }

}
