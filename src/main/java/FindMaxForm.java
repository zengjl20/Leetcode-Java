import java.util.ArrayList;
import java.util.List;

public class FindMaxForm {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][][] dp = new int[len + 1][m + 1][n + 1];
        for(int index = 0; index < len; index++) {
            int[] counts = getCounts(strs[index]);
            for(int i = 0; i <= m; i++) {
                for(int j = 0; j <= n; j++) {
                    dp[index + 1][i][j] = dp[index][i][j];
                    if(i >= counts[0] && j >= counts[1]){
                        dp[index + 1][i][j] = Math.max(dp[index][i - counts[0]][j - counts[1]] + 1, dp[index][i][j]);
                    }
                }
            }
        }
        return dp[len][m][n];
    }

    private int[] getCounts(String str) {
        int[] counts = new int[2];
        for(int i = 0; i < str.length(); i++) {
            counts[str.charAt(i) - '0']++;
        }
        return counts;
    }
}
