public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int end = array.length -1;
        int begin = 0;
        int mid;
        while (end > begin){
            mid = (begin + end) / 2;
            if(array[mid] <= k){
                begin = mid + 1;
            }else{
                end = mid;
            }
        }
        int rbound = begin;
        end = array.length - 1;
        begin = 0;
        while (begin < end){
            mid = (begin + end) / 2;
            if(array[mid] < k){
                begin = mid + 1;
            }else{
                end = mid;
            }
        }
        return rbound - end;
    }
}
