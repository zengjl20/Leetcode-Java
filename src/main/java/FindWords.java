import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindWords {
    private class Tried {
        private Tried[] children;
        private boolean isEnd;
        private String word;

        public Tried() {
            children = new Tried[26];
            isEnd = false;
        }

        public void insert(String word) {
            Tried node = this;
            for(int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if(node.children[index] == null) {
                    node.children[index] = new Tried();
                }
                node = node.children[index];
            }
            node.isEnd = true;
            node.word = word;
        }
    }

    private List<String> res = new ArrayList<>();
    private Set<String> set = new HashSet<>();
    private boolean[][] isVisited;

    public List<String> findWords(char[][] board, String[] words) {
        Tried trie = new Tried();
        isVisited = new boolean[board.length][board[0].length];
        for(String word : words) {
            trie.insert(word);
        }
        Tried node = trie;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                dfs(i, j, board, node);
            }
        }
        for(String word : set) {
            res.add(word);
        }
        return res;
    }

    private void dfs(int i, int j, char[][] board, Tried node) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || isVisited[i][j]) return;
        int index = board[i][j] - 'a';
        if(node.children[index] == null) return;
        else {
            node = node.children[index];
            if(node.isEnd) {
                set.add(node.word);
            }
            isVisited[i][j] = true;
            dfs(i + 1, j, board, node);
            dfs(i - 1, j, board, node);
            dfs(i, j + 1, board, node);
            dfs(i, j - 1, board, node);
            isVisited[i][j] = false;
        }
    }
}
