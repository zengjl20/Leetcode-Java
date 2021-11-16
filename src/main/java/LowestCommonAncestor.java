public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > q.val){
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }
        while (root != null){
            if(root.val < p.val) root = root.right;
            else if(root.val > q.val) root = root.left;
            else break;
        }
        return root;
    }
}
