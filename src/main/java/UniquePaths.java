public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] res = new int[m + 1][n + 1];
        return computePath(res, m, n);
    }

    private int computePath(int[][] res, int m, int n) {
        if(res[m][n] != 0) return res[m][n];
        if(m == 1 || n == 1){
            res[m][n] = 1;
            return 1;
        }
        res[m][n] = computePath(res, m - 1, n) + computePath(res, m, n - 1);
        return res[m][n];
    }
}
