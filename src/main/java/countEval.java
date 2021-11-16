public class countEval {
    public static int countEval(String s, int result) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int[][][] dp = new int[n][n][2];
        for (int i = 0; i < n; i += 2) {
            dp[i][i][0] = ch[i] == '0' ? 1 : 0;
            dp[i][i][1] = ch[i] == '1' ? 1:0;
        }
        
        for(int len = 3; len <= n; len += 2){
            for (int i = 0; i <= n - len; i += 2){
                int j = i + len - 1;
                for(int k = i + 1; k < j; k += 2){
                    switch (ch[k]){
                        case '&':
                            dp[i][j][0] += dp[i][k-1][1] * dp[k+1][j][0];
                            dp[i][j][0] += dp[i][k-1][0] * dp[k+1][j][1];
                            dp[i][j][0] += dp[i][k-1][0] * dp[k+1][j][0];
                            dp[i][j][1] += dp[i][k-1][1] * dp[k+1][j][1];
                            break;
                        case '|':
                            dp[i][j][0] += dp[i][k-1][0] * dp[k+1][j][0];
                            dp[i][j][1] += dp[i][k-1][1] * dp[k+1][j][0];
                            dp[i][j][1] += dp[i][k-1][0] * dp[k+1][j][1];
                            dp[i][j][1] += dp[i][k-1][1] * dp[k+1][j][1];
                            break;
                        case '^':
                            dp[i][j][1] += dp[i][k-1][0] * dp[k+1][j][1];
                            dp[i][j][1] += dp[i][k-1][1] * dp[k+1][j][0];
                            dp[i][j][0] += dp[i][k-1][0] * dp[k+1][j][0];
                            dp[i][j][0] += dp[i][k-1][1] * dp[k+1][j][1];
                            break;
                    }
                }
            }
        }
        return dp[0][n-1][result];
    }

    public static void main(String[] args){
        String s = "0&0&0&1^1|0";
        int result = 1;
        System.out.println(countEval(s, result));
    }
}
