public class DiameterOfBinaryTree {
    private int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        depth(root);
        return ans;
    }

    private int depth(TreeNode node) {
        if(node == null) return 0;
        int l = depth(node.left);
        int r = depth(node.right);
        ans = Math.max(ans, l + r);
        return Math.max(l, r) + 1;
    }
}
