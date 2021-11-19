import java.util.*;

public class SubsetsWithDup {
    private List<List<Integer>> res = new ArrayList<>();
    private boolean[] used;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int len = nums.length;
        used = new boolean[len];
        Arrays.sort(nums);
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
            if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            path.add(nums[i]);
            used[i] = true;
            dfs(nums, len, i + 1, path);
            used[i] = false;
            path.removeLast();
        }
    }
}
