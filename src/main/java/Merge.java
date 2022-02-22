public class Merge {
    private int[] tmp;

    public int[] sortArray(int[] nums) {
        tmp = new int[nums.length];
        merge(nums, 0, nums.length - 1);
        return nums;
    }

    private void merge(int[] nums, int left, int right) {
        if(left == right) {
            return;
        }
        int mid = left + (right - left) / 2;
        merge(nums, left, mid);
        merge(nums, mid + 1, right);
        int i = left, j = mid + 1;
        int cnt = 0;
        while (i <= mid && j <= right) {
            if(nums[i] <= nums[j]) {
                tmp[cnt++] = nums[i++];
            } else {
                tmp[cnt++] = nums[j++];
            }
        }
        while (i <= mid) {
            tmp[cnt++] = nums[i++];
        }
        while (j <= right) {
            tmp[cnt++] = nums[j++];
        }
        for(int k = 0; k < cnt; k++) {
            nums[left + k] = tmp[k];
        }
    }
}
