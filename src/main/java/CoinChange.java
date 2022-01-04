import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for(int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for(int coin : coins) {
                if(i - coin >= 0) {
                    if(dp[i - coin] == -1) continue;
                    min = Math.min(min, dp[i - coin] + 1);
                }
            }
            if(min == Integer.MAX_VALUE) dp[i] = -1;
            else dp[i] = min;
        }
        return dp[amount];
    }
}
