import java.util.Stack;

public class KthNode {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot == null){return null;}
        TreeNode curr = pRoot;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || curr != null){
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            }else{
                curr = stack.pop();
                if(--k == 0){
                    return curr;
                }
                curr = curr.right;
            }
        }
        return null;
    }
}
