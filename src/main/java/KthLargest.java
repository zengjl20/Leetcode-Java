public class KthLargest {
    private int i, res;

    public int kthLargest(TreeNode root, int k) {
        if(root == null) return 0;
        this.i = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(i == 0) return;
        i--;
        if(i == 0) res = root.val;
        dfs(root.left);
    }
}
