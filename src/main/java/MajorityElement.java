public class MajorityElement {
    public int majorityElement(int[] nums) {
        int now = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(count == 0) now = nums[i];
            if(nums[i] == now) count++;
            else count--;
        }
        return now;
    }
}
