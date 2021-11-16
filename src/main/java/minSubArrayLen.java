public class minSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums){
        int left = 0, total = 0;
        int len = nums.length;
        int ret = len;
        boolean flag = false;
        for(int right = 0; right < len; right++){
            total += nums[right];
            while (total >= target){
                if(right - left + 1 < ret){
                    ret = right - left + 1;
                }
                total -= nums[left];
                left ++;
                flag = true;
            }
        }
        if(flag){
            return ret;
        }
        return 0;
    }

    public static void main(String[] args){
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }
}
