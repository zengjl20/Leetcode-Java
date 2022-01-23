public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0) nums[i] = n + 2;
        }
        for(int i = 0; i < nums.length; i++) {
            int x = Math.abs(nums[i]);
            if(x > 0 && x <= n) {
                if(nums[x] > 0) nums[x] = -nums[x];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) return i + 1;
        }
        return n + 1;
    }
}
