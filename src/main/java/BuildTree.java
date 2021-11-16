import java.util.HashMap;

public class BuildTree {
    private int[] preorder;
    private HashMap<Integer, Integer> hashMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for(int i = 0; i < inorder.length; i++){
            hashMap.put(inorder[i], i);
        }
        return curTree(0, 0, inorder.length - 1);
    }

    private TreeNode curTree(int root, int i, int j) {
        if(i > j) return null;
        if(i == j) return new TreeNode(preorder[root]);
        TreeNode node = new TreeNode(preorder[root]);
        int m = hashMap.get(preorder[root]);
        node.left = curTree(root + 1, i, m - 1);
        node.right = curTree(root + m - i + 1, m + 1, j);
        return node;
    }
}
