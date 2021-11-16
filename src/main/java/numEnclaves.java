public class numEnclaves {
    private int[][] griding;
    private boolean[][] isMark;

    public int numEnclaves(int[][] grid) {
        int len = grid.length;
        int len2 = grid[0].length;
        int count = 0;
        int countMark = 0;
        boolean[][] isMarked = new boolean[len][len2];
        griding = grid;
        isMark = isMarked;
        for(int i = 0; i < len; i++){
            mark(i, 0);
            mark(i, len2-1);
        }
        for(int i = 0; i < len2;i++){
            mark(0, i);
            mark(len -1, i);
        }
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len2; j++){
                if(grid[i][j] == 1){
                    count++;
                }
                if(isMarked[i][j]){
                    countMark++;
                }
            }
        }
        return count - countMark;
    }

    private void mark(int i, int j) {
        if(isMark[i][j]){
            return;
        }
        if(griding[i][j] == 1){
            isMark[i][j] = true;
            try{
                mark(i+1, j);
            }catch (Exception e){}
            try{
                mark(i-1, j);
            }catch (Exception e){}
            try{
                mark(i, j+1);
            }catch (Exception e){}
            try{
                mark(i, j-1);
            }catch (Exception e){}
        }
    }
}
