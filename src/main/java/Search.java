public class Search {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if(nums[mid] > nums[mid + 1]) break;
            if(nums[left] < nums[mid]) left = mid + 1;
            else right = mid;
        }
        if(target >= nums[0]) {
            left = 0;
            right = mid;
        }
        else {
            left = mid + 1;
            right = nums.length - 1;
        }
        while (left < right) {
            mid = (left + right) / 2;
            if(nums[mid] == target) return mid;
            if(target < nums[mid]) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
