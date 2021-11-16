public class optimalDivision {
    public String optimalDivision(int[] nums) {
        T t = optimal(nums, 0, nums.length - 1);
        return t.max_str;
    }

    private T optimal(int[] nums, int start, int end) {
        T t = new T();
        if (start == end) {
            t.max_val = nums[start];
            t.min_val = nums[start];
            t.max_str = "" + nums[start];
            t.min_str = "" + nums[start];
            return t;
        }
        t.max_val = Float.MIN_VALUE;
        t.min_val = Float.MAX_VALUE;
        for (int i = start; i < end; i++) {
            T left = optimal(nums, start, i);
            T right = optimal(nums, i + 1, end);
            if(left.max_val / right.min_val > t.max_val){
                t.max_val = left.max_val / right.min_val;
                t.max_str = left.max_str + "/" + (i + 1 == end ? "" : "(") + right.min_str + (i + 1 == end ? "" : ")");
            }
            if(left.min_val / right.max_val < t.min_val){
                t.min_val = left.min_val / right.max_val;
                t.min_str = left.min_str + "/" + (i + 1 == end ? "" : "(") + right.max_str + (i + 1 == end ? "" : ")");
            }
        }
        return t;
    }

    class T {
        float max_val, min_val;
        String max_str, min_str;
    }
}
