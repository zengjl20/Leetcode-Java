import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        int max = nums[0], preMax = nums[0], preMin = nums[0];
        for(int i = 1; i < nums.length; i++){
            int m = preMax, n = preMin;
            preMax = Math.max(nums[i], Math.max(m * nums[i], n * nums[i]));
            preMin = Math.min(nums[i], Math.min(m * nums[i], n * nums[i]));
            max = Math.max(preMax, max);
        }
        return max;
    }
}
