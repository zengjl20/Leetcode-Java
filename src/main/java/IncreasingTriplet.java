import java.util.Deque;
import java.util.LinkedList;

public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int first = nums[0], second = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            int num = nums[i];
            if(num > second) {
                return true;
            } else if(num > first) {
                second = num;
            } else {
                first = num;
            }
        }
        return false;
    }
}
