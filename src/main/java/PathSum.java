import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSum {
    private List<List<Integer>> lists = new LinkedList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root == null){
            return lists;
        }
        dfs(root, target);
        return lists;
    }

    private void dfs(TreeNode root, int k) {
        if(root.left == null && root.right == null){
            if(root.val != k) return;
            if(root.val == k){
                path.add(root.val);
                lists.add(new LinkedList<>(path));
                path.removeLast();
                return;
            }
        }
        path.add(root.val);
        if(root.left != null) dfs(root.left, k - root.val);
        if(root.right != null) dfs(root.right, k - root.val);
        path.removeLast();
    }
}
