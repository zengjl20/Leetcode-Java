import java.util.LinkedList;
import java.util.Queue;

public class IsValidBST {
    public boolean isValidBST(TreeNode root) {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean check(TreeNode node, int low, int up) {
        if(node == null) return true;
        if(node.val < low || node.val > up) return false;
        return check(node.left, low, node.val) && check(node.right, node.val, up);
    }


}
