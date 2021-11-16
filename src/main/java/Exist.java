public class Exist {
    public boolean exist(char[][] board, String word) {
        if(board.length == 0) return false;
        char[] words = word.toCharArray();
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != words[k]) return false;
        if(k == words.length - 1) return true;
        board[i][j] = '\0';
        boolean res =  dfs(board, words, i+1, j, k+1) || dfs(board, words, i-1, j, k+1) ||
                dfs(board, words, i, j+1, k+1) || dfs(board, words, i, j-1, k+1);
        board[i][j] = words[k];
        return res;
    }

}
