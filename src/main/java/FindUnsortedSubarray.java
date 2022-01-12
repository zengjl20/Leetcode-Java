import java.util.HashMap;

public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int curMin = Integer.MAX_VALUE, curMax = Integer.MIN_VALUE;
        HashMap<Integer, Integer> minMap = new HashMap<>();
        HashMap<Integer, Integer> maxMap = new HashMap<>();
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] < curMin) {
                curMin = nums[i];
                minMap.put(i, curMin);
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > curMax) {
                curMax = nums[i];
                maxMap.put(i, curMax);
            }
        }
        int left = 0, right = nums.length - 1;
        while (left < nums.length - 1 && nums[left] < minMap.get(left + 1)) left++;
        while (right > 0 && nums[right] > maxMap.get(right - 1)) right--;
        if(left == nums.length) return 0;
        return right - left + 1;
    }
}
