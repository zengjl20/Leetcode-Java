public class NumWays {
    public int numWays(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        int p = 1, q = 1, sum = 2;
        for(int i = 2; i <= n; i++){
            sum = p + q;
            p = q;
            q = sum;
        }
        return sum;
    }
}
