import java.util.LinkedList;
import java.util.List;

public class LDR {
    private List<Integer> list = new LinkedList<>();
    public List<Integer> ldr(TreeNode root){
        dfs(root);
        return list;
    }

    private void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
