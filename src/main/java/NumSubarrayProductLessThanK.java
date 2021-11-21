import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NumSubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length, count = 0;
        int maxCur = 1;
        for(int i = 0; i < len; i++){
            maxCur = maxCur * nums[i];
            int j = 0, cur = maxCur;
            while (j <= i){
                if(cur < k){
                    count++;
                }
                cur = cur / nums[j];
                j++;
            }
        }
        return count;
    }
}
