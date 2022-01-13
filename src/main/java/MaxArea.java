public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = Integer.MIN_VALUE;
        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            if(height[left] > height[right]) right--;
            else left++;
        }
        return max;
    }
}
