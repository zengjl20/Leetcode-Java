import java.util.LinkedList;
import java.util.Queue;

public class Mirror {
    public TreeNode Mirror (TreeNode pRoot) {
        // 递归和遍历皆可求解
        if(pRoot == null){
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(pRoot);
        while (!q.isEmpty()){
            TreeNode node = q.poll();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
        }
        return pRoot;
    }
}
