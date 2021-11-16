import static java.lang.Math.abs;
import static java.lang.Math.max;

public class IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){return true;}
        if(abs(DepthOfTree(root.left) - DepthOfTree(root.right)) > 1){
            return false;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    private int DepthOfTree(TreeNode node) {
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return 1;
        }
        return 1 + max(DepthOfTree(node.left), DepthOfTree(node.right));
    }
}
