import java.util.*;

public class CombinationSum {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Deque<Integer> list = new ArrayDeque<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, list);
        return res;
    }

    private void dfs(int[] candidates, int target, int cur, Deque<Integer> list) {
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = cur; i < candidates.length; i++){
            if(candidates[i] > target) continue;
            list.push(candidates[i]);
            dfs(candidates, target - candidates[i], i, list);
            list.pop();
        }
    }
}
