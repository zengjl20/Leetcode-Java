import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalIntersection {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList.length == 0 || secondList.length == 0){
            return new int[][]{};
        }
        int i = 0, j = 0;
        List<int[]> res = new ArrayList<>();
        while (i < firstList.length && j < secondList.length){
            if(firstList[i][0] > secondList[j][1]) j++;
            else if(firstList[i][1] < secondList[j][0]) i++;
            else {
                res.add(new int[]{Math.max(firstList[i][0], secondList[j][0]),
                        Math.min(firstList[i][1], secondList[j][1])});
                if(firstList[i][1] < secondList[j][1]) i++;
                else j++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
