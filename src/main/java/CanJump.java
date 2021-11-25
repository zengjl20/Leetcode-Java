public class CanJump {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int k = 0;
        for(int i = 0; i < len; i++){
            k = Math.max(k, i + nums[i]);
        }
        if(k >= len - 1) return true;
        return false;
    }
}
