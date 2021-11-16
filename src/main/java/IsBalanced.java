public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode node) {
        if(node == null) return 0;
        int left = recur(node.left);
        if(left == -1) return -1;
        int right = recur(node.right);
        if(right == -1) return -1;
        if(Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }
}
