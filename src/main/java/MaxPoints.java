import java.util.HashMap;
import java.util.Map;

public class MaxPoints {
    public int maxPoints(int[][] points) {
        int n = points.length, res = Integer.MIN_VALUE;
        Map<Float, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                float a = ((float) points[i][1] - points[j][1]) / (points[i][0] - points[j][0]);
                if(a == -0.0f) a = 0.0f;
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
            for(Map.Entry<Float, Integer> entry : map.entrySet()) {
                res = Math.max(res, entry.getValue());
            }
            map.clear();
        }
        return res + 1;
    }
}
