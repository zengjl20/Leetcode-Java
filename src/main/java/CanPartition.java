public class CanPartition {
    private boolean flag = false;

    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        dfs(nums, left, 0, 1);
        dfs(nums, left, 0, -1);
        return flag;
    }

    private void dfs(int[] nums, int[] left, int i, int j) {
        if(flag) return;
        left[i] = j;
        if(i == nums.length - 1) {
            if(isZero(nums, left)) flag = true;
            return;
        }
        dfs(nums, left, i + 1, 1);
        dfs(nums, left, i + 1, -1);
    }

    private boolean isZero(int[] nums, int[] left) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i] * left[i];
        }
        if(sum == 0) return true;
        return false;
    }
}
