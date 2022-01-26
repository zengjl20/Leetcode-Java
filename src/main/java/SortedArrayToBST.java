public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return head(nums, 0, nums.length - 1);
    }

    private TreeNode head(int[] nums, int l, int r) {
        if(l > r) return null;
        int mid = (l + r) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = head(nums, l, mid - 1);
        node.right = head(nums, mid + 1, r);
        return node;
    }
}
