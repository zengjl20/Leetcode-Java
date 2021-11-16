import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class arrayRankTransform {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortArr);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i = 1;
        for(int num : sortArr){
            if(map.containsKey(num)){
                continue;
            }
            map.put(num, i);
            i++;
        }
        for(int j = 0; j < arr.length; j++){
            arr[j] = map.get(arr[j]);
        }
        return arr;
    }
}
