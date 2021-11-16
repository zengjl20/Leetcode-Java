public class MaxProfit {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int n = prices.length, curMin = prices[0], curMaxP = 0;
        for(int i = 1; i < n; i++){
            if(prices[i] - curMin > curMaxP){
                curMaxP = prices[i] - curMin;
            }
            if(prices[i] < curMin){
                curMin = prices[i];
            }
        }
        return curMaxP;
    }
}
