import java.util.Random;

public class QuickSort {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int l, int r) {
        if(l < r) {
            int pos = partition(nums, l, r);
            quickSort(nums, l, pos - 1);
            quickSort(nums, pos + 1, r);
        }
    }

    private int partition(int[] nums, int l, int r) {
        int i = new Random().nextInt(r - l + 1) + l;
        swap(nums, i, r);
        int j = l;
        for(int k = l; k < r; k++) {
            if(nums[k] < nums[r]) {
                swap(nums, k, j);
                j++;
            }
        }
        swap(nums, j, r);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
