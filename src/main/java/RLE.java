import java.util.ArrayList;
import java.util.List;

public class RLE {
    String key;
    List<Integer> counts;

    public RLE(String s){
        StringBuilder sb = new StringBuilder();
        counts = new ArrayList<>();
        char[] sa = s.toCharArray();
        int prev = -1;
        int n = sa.length;
        for(int i = 0; i < n; i++){
            if(i == n-1 || sa[i] != sa[i+1]){
                sb.append(sa[i]);
                counts.add(i-prev);
                prev = i;
            }
        }
        key = sb.toString();
    }
}
