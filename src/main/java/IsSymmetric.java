import apple.laf.JRSUIUtils;

import java.util.regex.Pattern;

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isEquall(root.left, root.right);
    }

    public boolean isEquall(TreeNode A, TreeNode B){
        if(A == null && B == null){
            return true;
        }
        if(A == null || B == null || A.val != B.val){
            return false;
        }
        return isEquall(A.left, B.right) && isEquall(A.right, B.left);
    }
}
