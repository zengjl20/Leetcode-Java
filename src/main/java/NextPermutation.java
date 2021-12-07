public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n == 1) return;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        int j = n - 1;
        while (i >= 0 && j > i){
            if(nums[j] > nums[i]){
                swap(nums, i, j);
                desc(nums, i + 1, n - 1);
                return;
            }
            j--;
        }
        desc(nums, 0, n - 1);
    }

    private void desc(int[] nums, int begin, int end) {
        for(int i = begin; i <= (begin + end) / 2; i++){
            swap(nums, i, begin + end - i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
