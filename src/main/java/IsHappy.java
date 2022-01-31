import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            int i = 0;
            while (n > 0) {
                i += (n % 10) * (n % 10);
                n /= 10;
            }
            if(i == 1) return true;
            n = i;
        }
        return false;
    }
}
