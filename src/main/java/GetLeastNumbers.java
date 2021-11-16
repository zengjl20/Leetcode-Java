public class GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSortK(arr, 0, arr.length - 1, k);
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = arr[i];
        }
        return res;
    }

    private void quickSortK(int[] arr, int l, int r, int k) {
        if(l >= r) return;
        int i = l, j = r;
        int tmp = arr[i];
        while (i < j){
            while (arr[j] >= arr[l] && i < j) j--;
            while (arr[i] <= arr[l] && i < j) i++;
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        arr[i] = arr[l];
        arr[l] = tmp;
        if(i == k - 1) return;
        else if(i < k - 1) quickSortK(arr, i + 1, r, k);
        else quickSortK(arr, l, i - 1, k);
    }
}
