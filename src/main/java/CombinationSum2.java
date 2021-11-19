import java.util.*;

public class CombinationSum2 {
    private boolean used[];
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        Arrays.sort(candidates);
        used = new boolean[len];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, 0, target, path);
        return res;
    }

    private void dfs(int[] candidates, int cur, int target, Deque<Integer> path) {
        if(target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = cur; i < candidates.length; i++){
            if(candidates[i] > target) break;
            if(i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            path.add(candidates[i]);
            dfs(candidates, i + 1, target - candidates[i], path);
            used[i] = false;
            path.removeLast();
        }
    }

}
