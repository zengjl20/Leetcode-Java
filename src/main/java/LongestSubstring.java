public class LongestSubstring {
    public int longestSubstring(String s, int k) {
        int res = 0;
        int n = s.length();
        for (int t = 1; t <= 26; t++) {
            int l = 0, r = 0;
            int cnt = 0, more = 0;
            int[] counts = new int[26];
            while (r < n) {
                int idx = s.charAt(r) - 'a';
                if(counts[idx] == 0) {
                    cnt++;
                }
                counts[idx]++;
                if(counts[idx] == k) {
                    more++;
                }
                while (cnt > t) {
                    idx = s.charAt(l) - 'a';
                    if(counts[idx] == k) {
                        more--;
                    }
                    counts[idx]--;
                    if(counts[idx] == 0) {
                        cnt--;
                    }
                    l++;
                }
                if(cnt == more) {
                    res = Math.max(res, r - l + 1);
                }
            }
        }
        return res;
    }
}
