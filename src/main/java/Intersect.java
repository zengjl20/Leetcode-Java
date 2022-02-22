import java.util.*;

public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for(int num : nums1) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }
        int size = 0;
        int[] res = new int[nums1.length + nums2.length];
        for(int num : nums2) {
            if(numCount.containsKey(num) && numCount.get(num) != 0) {
                res[size++] = num;
                numCount.put(num, numCount.get(num) - 1);
            }
        }
        return Arrays.copyOfRange(res, 0, size);
    }
}
