public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if(nums[mid] == target) break;
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        if(left > right) return new int[]{-1, -1};
        left = mid;
        right = mid;
        while (nums[left] == nums[left - 1]) left--;
        while (nums[right] == nums[right + 1]) right++;
        return new int[]{left, right};
    }
}
