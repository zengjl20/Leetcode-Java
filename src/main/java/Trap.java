public class Trap {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++) {
            if(height[i - 1] > left) {
                left = height[i - 1];
            }
            if(height[n - i] >right) {
                right = height[n - i];
            }
            leftMax[i] = left;
            rightMax[n - i - 1] = right;
        }
        int res = 0;
        for(int i = 1; i < n - 1; i++) {
            int x = Math.min(leftMax[i], rightMax[i]);
            if(x > height[i]) res += x - height[i];
        }
        return res;
    }
}
