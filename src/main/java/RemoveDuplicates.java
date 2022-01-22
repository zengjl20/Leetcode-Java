public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            nums[slow] = nums[fast];
            slow++;
            fast++;
            while (fast < nums.length && nums[fast - 1] == nums[fast]) fast++;
        }
        return slow;
    }
}
