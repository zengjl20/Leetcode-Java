public class CanCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i = 0; i < gas.length; i++) {
            gas[i] = gas[i] - cost[i];
        }
        int min = Integer.MAX_VALUE, index = 0, sum = 0;
        for(int i = 0; i < gas.length; i++) {
            sum += gas[i];
            if(sum < min) {
                min = sum;
                index = i;
            }
        }
        if(sum < 0) return -1;
        if(index == gas.length - 1) return 0;
        return index + 1;
    }
}
