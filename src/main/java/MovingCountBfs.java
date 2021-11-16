import java.util.LinkedList;
import java.util.Queue;

public class MovingCountBfs {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        int res = 0;
        queue.add(new int[] {0, 0});
        while (queue.size() != 0){
            int[] list = queue.poll();
            if(list[0] >= m || list[1] >= n || visited[list[0]][list[1]] ||
                bitSum(list[0]) + bitSum(list[1]) > k) continue;
            visited[list[0]][list[1]] = true;
            res++;
            queue.add(new int[] {list[0] + 1, list[1]});
            queue.add(new int[] {list[0], list[1] + 1});
        }
        return res;
    }

    private int bitSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
