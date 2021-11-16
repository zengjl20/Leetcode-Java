import java.util.*;

public class LevelOrder2 {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int flag = 0;
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()){
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = queue.size(); i > 0; i--){
                TreeNode node = queue.poll();
                if(flag % 2 == 0){
                    list.addLast(node.val);
                }else {
                    list.addFirst(node.val);
                }
                if(node.left != null){
                    queue.add(root.left);
                }
                if(node.right != null){
                    queue.add(root.right);
                }
            }
            flag++;
            lists.add(list);
        }
        return lists;
    }
}
