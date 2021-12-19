import java.util.ArrayList;
import java.util.List;

public class CanFinish {
    private List<List<Integer>> list;
    private int[] visited;
    private boolean flag;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        list = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            list.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites) {
            list.get(pre[0]).add(pre[1]);
        }
        visited = new int[numCourses];
        for(int i = 0; i< numCourses; i++) {
            if(visited[i] == 2) continue;
            if(visited[i] == 0) {
                dfs(i);
            }
            else if(visited[i] == 1) {
                return false;
            }
        }
        return true;
    }

    private void dfs(int i) {
        visited[i] = 1;
        for(int num : list.get(i)) {
            if(visited[num] == 2) continue;
            if(visited[num] == 1) {
                flag = false;
                 return;
            }
            dfs(num);
            if(!flag) return;
        }
        visited[i] = 2;
    }

}
