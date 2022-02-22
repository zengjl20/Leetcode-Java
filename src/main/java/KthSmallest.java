public class KthSmallest {
    private boolean end = false;
    private int res = 0;
    private int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode node) {
        if(node == null || end) return;
        dfs(node.left);
        count--;
        if(count == 0) {
            end = true;
            res = node.val;
            return;
        }
        dfs(node.right);
    }
}
