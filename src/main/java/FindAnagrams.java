import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length(), n = p.length();
        List<Integer> res = new ArrayList<>();
        if(m < n) return res;
        int[] sCnt = new int[26];
        int[] pCnt = new int[26];
        for(int i = 0; i < n; i++){
            sCnt[s.charAt(i) - 'a']++;
            pCnt[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(sCnt, pCnt)) res.add(0);
        for(int i = 1; i < m-n+1; i++){
            sCnt[s.charAt(i-1) - 'a']--;
            sCnt[s.charAt(i+n-1) - 'a']++;
            if(Arrays.equals(sCnt, pCnt)) res.add(i);
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
