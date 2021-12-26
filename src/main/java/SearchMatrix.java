public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len0 = matrix.length, len1 = matrix[0].length;
        int i = 0, j = len1 - 1;
        while (i < len0 && j >= 0){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}
