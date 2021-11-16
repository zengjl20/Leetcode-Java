import java.util.LinkedList;
import java.util.Queue;

public class TreeDepth {
    //本题可用递归来做，写法上更为简单。但采取队列的方法则是使用了广度优先搜索，遍历二叉树
    //队列是遍历二叉树较好的方法
    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int i = 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int count = 1;
        while(q.size() != 0){
            TreeNode node = q.poll();
            count--;
            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
            if(count == 0){
                i++;
                count = q.size();
            }
        }
        return i;
    }
}
