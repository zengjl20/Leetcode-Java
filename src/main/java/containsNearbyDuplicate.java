import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class containsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(i - map.get(nums[i]) <= k){
                    flag = true;
                    break;
                }
            }
            map.put(nums[i], i);
        }
        return flag;
    }
}
