public class IsSubtree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) || isSametree(root, subRoot);
    }

    private boolean isSametree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null || root.val != subRoot.val) return false;
        return isSametree(root.left, subRoot.left) && isSametree(root.right, subRoot.right);
    }
}
