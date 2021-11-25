public class Rob {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0) return nums[0];
        int[][] dp = new int[2][len];
        dp[0][0] = nums[0];
        dp[0][1] = Math.max(nums[0], nums[1]);
        dp[1][0] = nums[len - 1];
        dp[1][1] = Math.max(nums[len - 1], nums[len - 2]);
        for(int i = 2; i < len - 1; i++){
            dp[0][i] = Math.max(dp[0][i - 1], dp[0][i - 2] + nums[i]);
            dp[1][i] = Math.max(dp[1][i - 1], dp[1][i - 2] + nums[len - 1 - i]);
        }
        return Math.max(dp[0][len - 2], dp[1][len - 2]);
    }
}
