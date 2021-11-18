import java.util.*;

public class PermuteUnique {
    private List<List<Integer>> res = new ArrayList<>();
    private boolean[] visited;

    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        visited = new boolean[len];
        Arrays.sort(nums);
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, len, 0, path);
        return res;
    }

    private void dfs(int[] nums, int len, int depth, Deque<Integer> path) {
        if(depth == len){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0; i < len; i++){
            if(visited[i]) continue;

            if(i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            path.push(nums[i]);
            visited[i] = true;
            dfs(nums, len, depth+1, path);
            visited[i] = false;
            path.pop();
        }
    }
}
