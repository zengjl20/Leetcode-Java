public class Exist1 {
    private boolean flag = false;
    private int m, n;

    public boolean exist(char[][] board, String word) {
        int len = word.length();
        m = board.length;
        n = board[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dfs(board, word, 0, len, i, j);
            }
        }
        return flag;
    }

    private void dfs(char[][] board, String word, int cur, int len, int i, int j) {
        if(i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(cur)) return;
        if(cur == len - 1) {
            flag = true;
            return;
        }
        dfs(board, word, cur + 1, len, i + 1, j);
        dfs(board, word, cur + 1, len, i - 1, j);
        dfs(board, word, cur + 1, len, i, j + 1);
        dfs(board, word, cur + 1, len, i, j - 1);
    }
}
