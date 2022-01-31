import java.util.ArrayList;
import java.util.List;

public class FindOrder {
    private List<List<Integer>> edges = new ArrayList<>();
    private int[] result;
    private boolean valid;
    private int[] visited;
    private int index;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        index = numCourses - 1;
        result = new int[numCourses];
        visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        for(int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
        }
        for(int i = 0; i < numCourses & !valid; i++) {
            dfs(i);
        }
        if(valid) return new int[0];
        for(int i = 0; i < numCourses; i++) {
            if(visited[i] == 0) {
                result[index--] = i;
            }
        }
        return result;
    }

    private void dfs(int i) {
        if(visited[i] == 2) return;
        visited[i] = 1;
        for(int j : edges.get(i)) {
            if(visited[j] == 0) {
                dfs(j);
            } else if(visited[j] == 1) {
                valid = true;
                return;
            }
        }
        result[index--] = i;
        visited[i] = 2;
    }
}
