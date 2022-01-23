public class MyPow {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    private double quickMul(double x, long n) {
        if(n == 1l) return x;
        if(n == 0l) return 1.0;
        double u = quickMul(x, n / 2);
        return (n % 2 == 0)? u * u : u * u * x;
    }
}
