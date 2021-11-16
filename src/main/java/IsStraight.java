import java.util.Arrays;
import java.util.regex.Pattern;

public class IsStraight {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) {
                index = i;
                break;
            }
        }
        for(int i = index; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                return false;
            }
        }
        if(nums[nums.length - 1] - nums[index] < 5){
            return true;
        }
        return false;
    }
}
