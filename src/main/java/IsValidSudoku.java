public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] lines = new int[9][9];
        int[][] rectangle = new int[9][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                rows[i][board[i][j] - '1']++;
                lines[j][board[i][j] - '1']++;
                int index = (j / 3) * 3 + i / 3;
                rectangle[index][board[i][j] - '1']++;
                if(rows[i][board[i][j] - '1'] > 1 || lines[j][board[i][j] - '1'] > 1 ||
                        rectangle[index][board[i][j] - '1'] > 1) return false;
            }
        }
        return true;
    }
}
