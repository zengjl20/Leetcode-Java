public class MinArray {
    public int minArray(int[] numbers){
        int l = 0, r = numbers.length - 1;
        int mid;
        while (l < r){
            mid = (l + r) / 2;
            if(numbers[mid] > numbers[r]){
                l = mid + 1;
            }else if(numbers[mid] <= numbers[r]){
                r = mid;
            }
        }
        return numbers[l];
    }
}
