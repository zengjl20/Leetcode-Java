public class findLengthOfShortestSubarray {
    public static int findLengthOfShortestSubarray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right && arr[left] <= arr[left + 1] ) {
            left++;
        }
        if (left == right) {
            return 0;
        }
        while (right > left && arr[right] >= arr[right - 1]) {
            right--;
        }
        int i = 0;
        int j = right;
        int result;
        if(left >= arr.length - right){
            result = arr.length - left - 1;
        }else{
            result = right;
        }
        while (i <= left && j <= arr.length - 1){
            if(arr[i] <= arr[j]){
                if(result > j - i -1){
                    result = j - i - 1;
                    //System.out.println(result);
                }
                i++;
            }else {
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        System.out.println(findLengthOfShortestSubarray(arr));
        int k = 0;
        int ret = ++k + k++ + ++k + k-- + --k;
        System.out.println(ret);
    }
}
