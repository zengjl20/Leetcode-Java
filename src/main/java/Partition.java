import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Partition {
    private List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        List<String> list = new LinkedList<>();
        int n = s.length();
        dfs(0, n, s, list);
        return res;
    }

    private void dfs(int i, int n, String s, List<String> list) {
        if(i == n) {
            res.add(list);
            return;
        };
        for(int j = i; j < n; j++) {
            if(palin(i, j, s)) {
                list.add(s.substring(i, j + 1));
                dfs(j + 1, n, s, list);
                list.remove(s.substring(i, j + 1));
            }
        }
    }

    private boolean palin(int i, int j, String s) {
        if(i > j) return false;
        while (i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
