public class MySqrt {
    public int mySqrt(int x) {
        int l = 0, r = x, mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            long y = mid * mid;
            long z = (mid + 1) * (mid + 1);
            if(y <= x && z > x) return mid;
            else if(y > x) r = mid - 1;
            else l = mid + 1;
        }
        return mid;
    }
}
