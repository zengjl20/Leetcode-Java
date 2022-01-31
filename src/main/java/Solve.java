public class Solve {
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        boolean[][] notSurrounded = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            dfs(i, 0, board, notSurrounded);
            dfs(i, n - 1, board, notSurrounded);
        }
        for(int j = 0; j < n; j++) {
            dfs(0, j, board, notSurrounded);
            dfs(m - 1, j, board, notSurrounded);
        }
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(!notSurrounded[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(int i, int j, char[][] board, boolean[][] notSurrounded) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
        if(board[i][j] == 'X' || notSurrounded[i][j]) return;
        notSurrounded[i][j] = true;
        dfs(i + 1, j, board, notSurrounded);
        dfs(i - 1, j, board, notSurrounded);
        dfs(i, j + 1, board, notSurrounded);
        dfs(i, j - 1, board, notSurrounded);
    }
}
