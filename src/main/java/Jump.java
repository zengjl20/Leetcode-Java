import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Jump {
    public int jump(int[] nums) {
        int len = nums.length;
        int[] steps = new int[len];
        for(int i = 0; i < len - 1; i++){
            for(int j = 1; j <= nums[i]; j++){
                if(i + j >= len) continue;
                if(steps[i + j] == 0) steps[i + j] = steps[i] + 1;
                else if(steps[i + j] > steps[i] + 1) steps[i + j] = steps[i] + 1;
            }
        }
        return steps[len - 1];
    }
}
