public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        int res = 0;
        for(int i = 2; i < n; i++) {
            if(!primes[i]) {
                res++;
                if((long) i * i < n) {
                    for(int j = i * i; j < n; j += i) {
                        primes[j] = true;
                    }
                }
            }
        }
        return res;
    }
}
