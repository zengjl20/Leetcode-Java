import javax.transaction.TransactionRequiredException;

public class IsSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null || A == null){
            return false;
        }
        return isEqual(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean isEqual(TreeNode A, TreeNode B){
        if(B == null){
            return true;
        }
        if(A.val != B.val || A == null){
            return false;
        }
        return isEqual(A.left, B.left) && isEqual(A.right, B.right);
    }
}
