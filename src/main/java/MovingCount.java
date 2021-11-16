public class MovingCount {
    private int count = 0;
    private boolean[][] isArrived;

    public int movingCount(int m, int n, int k) {
        this.isArrived = new boolean[m][n];
        dfs(0, 0, k, m, n);
        return count;
    }

    private void dfs(int i, int j, int k, int m, int n) {
        if(i >= m || j >= n || isArrived[i][j] || bitSum(i)+bitSum(j) > k) return;
        count++;
        isArrived[i][j] = true;
        dfs(i + 1, j, k, m, n);
        dfs(i, j + 1, k, m, n);
        return;
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
