public class TitleToNumber {
    public int titleToNumber(String columnTitle) {
        int res = 0, base = 1, n = columnTitle.length();
        for(int i = 0; i < n; i++) {
            res += base * (columnTitle.charAt(n - i - 1) - 'A' + 1);
            base *= 26;
        }
        return res;
    }
}
