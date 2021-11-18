public class FindCircleNum {
    private boolean[] visited;
    private int res = 0;

    public int findCircleNum(int[][] isConnected) {
        visited = new boolean[isConnected.length];
        for(int i = 0; i < isConnected.length; i++){
            if(!visited[i]){
                dfs(i, isConnected);
                res++;
            }
        }
        return res;
    }

    private void dfs(int i, int[][]isConnected) {
        if(visited[i]) return;
        visited[i] = true;
        for(int j = i + 1; j < isConnected.length; j++){
            if(isConnected[i][j] == 1) dfs(j ,isConnected);
        }
    }
}
