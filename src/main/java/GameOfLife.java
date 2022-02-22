public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                changeState(board, i, j, m, n);
            }
        }
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 2) board[i][j] = 1;
                if(board[i][j] == 3) board[i][j] = 0;
            }
        }
    }

    private void changeState(int[][] board, int i, int j, int m, int n) {
        int count = 0;
        if(i > 0 && j > 0 && (board[i - 1][j - 1] == 1 || board[i - 1][j - 1] == 3)) {
            count++;
        }
        if(i > 0 && (board[i - 1][j] == 1 || board[i - 1][j] == 3)) count++;
        if(i > 0 && j < n - 1 && (board[i - 1][j + 1] == 1 || board[i - 1][j + 1] == 3)) count++;
        if(j > 0 && (board[i][j - 1] == 1 || board[i][j - 1] == 3)) count++;
        if(j > 0 && i < m - 1 && (board[i + 1][j - 1] == 1 || board[i + 1][j - 1] == 3)) count++;
        if(i < m - 1 && (board[i + 1][j] == 1 || board[i + 1][j] == 3)) count++;
        if(i < m - 1 && j < n - 1 && (board[i + 1][j + 1] == 1 || board[i + 1][j + 1] == 3)) count++;
        if(j < n - 1 && (board[i][j + 1] == 1 || board[i][j + 1] == 3)) count++;
        if(board[i][j] == 1) {
            if(count < 2 || count > 3) board[i][j] = 3;
        }
        if(board[i][j] == 0) {
            if(count == 3) board[i][j] = 2;
        }
    }
}
