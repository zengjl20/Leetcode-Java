public class ProduceExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for(int i = 0; i < len - 1; i++) {
            if(i == 0) {
                res[len - i - 1] = nums[len - i - 1];
            }
            else {
                res[len - i - 1] = res[len - i] * nums[len - i - 1];
            }
        }
        int left = 1;
        for(int i = 0; i < len; i++) {
            if(i == 0) {
                res[i] = res[1];
                left = nums[0];
            }
            else if(i == len - 1) res[i] = left;
            else {
                res[i] = left * res[i + 1];
                left = left * nums[i];
            }
        }
        return res;
    }
}
