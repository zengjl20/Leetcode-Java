public class SortColors {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                swap(nums, left, i);
                left++;
            }
        }
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] == 2){
                swap(nums, right, i);
                right--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }
}
