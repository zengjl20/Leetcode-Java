import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetZeros {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        Set<Integer> setLine = new HashSet<>();
        Set<Integer> setRow = new HashSet<>();
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    setRow.add(i);
                    setLine.add(j);
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(setRow.contains(i) || setLine.contains((j))) {
                    matrix[i][j] = 0;
                }
            }
        }
        return;
    }
}
