import java.util.ArrayList;
import java.util.List;

public class Flatten {

    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preorderTraversal(list, root);
        for(int i = 1; i < list.size(); i++){
            TreeNode prev = list.get(i - 1);
            prev.left = null;
            prev.right = list.get(i);
        }
    }

    private void preorderTraversal(List<TreeNode> list, TreeNode root) {
        if(root == null) return;
        list.add(root);
        preorderTraversal(list, root.left);
        preorderTraversal(list, root.right);
    }
}
