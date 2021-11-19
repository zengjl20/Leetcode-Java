import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Subsets {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, len, 0, path);
        return res;
    }

    private void dfs(int[] nums, int len, int cur, Deque<Integer> path) {
        res.add(new ArrayList<>(path));
        if(len == cur) {
            return;
        }
        for(int i = cur; i< len; i++){
            path.add(nums[i]);
            dfs(nums, len, i + 1, path);
            path.removeLast();
        }
    }
}
