public class minStartValue {
    public int minStartValue(int[] nums) {
        int currentValue = 0;
        int minValue = 0;
        for(int num : nums){
            currentValue += num;
            if(currentValue < minValue){
                minValue = currentValue;
            }
        }
        return -minValue + 1;
    }
}
