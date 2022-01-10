import java.util.*;

public class ConvertBST {
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        Deque<Integer> deque = new LinkedList<>();
        dfs(root, deque);
        return root;
    }

    private void dfs(TreeNode node, Deque<Integer> deque) {
        if(node == null) return;
        dfs(node.right, deque);
        sum += node.val;
        node.val = sum;
        dfs(node.left, deque);
    }
}
