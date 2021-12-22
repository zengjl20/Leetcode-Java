public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        int len = matrix.length, width = matrix[0].length;
        int res = 0;
        int[][] dp = new int[len][width];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < width; j++) {
                if(matrix[i][j] == '0') dp[i][j] = 0;
                else {
                    if(i == 0 || j == 0) dp[i][j] = 1;
                    else dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    res = Math.max(dp[i][j], res);
                }
            }
        }
        return res;
    }
}
