import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class containsNearbyAlmostDuplicate {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> treeSet = new TreeSet<Long>();
        for(int i = 0; i < nums.length; i++){
            Long ceiling = treeSet.ceiling((long)nums[i] - (long)t);
            if(ceiling != null && ceiling <= (long)nums[i] + (long)t){
                return true;
            }
            treeSet.add((long)nums[i]);
            if(i >= k){
                treeSet.remove((long)nums[i-k]);
            }
        }
        return false;
    }
}
