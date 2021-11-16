import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n){
            if(nums[i] == i){
                i++;
                continue;
            }
            if(nums[i] == nums[nums[i]]){return nums[i];}
            int tem = nums[i];
            nums[i] = nums[tem];
            nums[tem] = tem;

        }
        return -1;
    }
}
