public class MoveZeros {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 0) {
                int j = i + 1;
                while (j < nums.length && nums[j] == 0) {
                    j++;
                }
                if(j == nums.length) return;
                swap(nums, i, j);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
