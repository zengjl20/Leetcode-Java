import java.util.Arrays;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        Integer[] list = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++) {
            list[i] = nums[i];
        }
        Arrays.sort(list, (a, b) -> {
            float xa = (float) a;
            float xb = (float) b;
            while (xa >= 10) xa /= 10;
            while (xb >= 10) xb /= 10;
            float x = xb - xa;
            while (x < 1) x *= 10;
            return (int) x;
        });
        if(list[0] == 0) return "0";
        StringBuilder stringBuilder = new StringBuilder();
        for(Integer i : list) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }
}
