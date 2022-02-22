import java.util.PriorityQueue;
import java.util.Queue;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> queue = new PriorityQueue<>((int[] a, int[] b) -> a[0] != b[0] ? b[0] - a[0] : a[1] - b[1]);
        for(int i = 0; i < k; i++) {
            queue.offer(new int[]{nums[i], i});
        }
        int[] res = new int[n - k + 1];
        res[0] = queue.peek()[0];
        for(int i = k; i < n; i++) {
            queue.offer(new int[]{nums[i], i});
            while (queue.peek()[1] <= i - k) {
                queue.poll();
            }
            res[i - k + 1] = queue.peek()[0];
        }
        return res;
    }
}
