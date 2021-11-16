public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for(int i = 1; i< s.length(); i++){
            boolean flag = true;
            for(int j = 1; j <= dp[i-1]; j++){
                if(s.charAt(i) == s.charAt(i-j)){
                    dp[i] = j;
                    flag = false;
                    break;
                }
            }
            if(flag){
                dp[i] = dp[i-1] + 1;
            }
        }
        int res = 1;
        for(int i = 1; i < s.length(); i++){
            if(dp[i] > res) res = dp[i];
        }
        return res;
    }

}
