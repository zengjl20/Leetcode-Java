import java.util.Arrays;

public class videoStitching {
    public int videoStitching(int[][] clips, int time) {
        int count = 0;
        int currLeft = 0;
        int currRight = 0;
        Arrays.sort(clips, (int[] a, int[]b)->a[0]-b[0]);
        for(int[] clip : clips){
            if(clip[0] <= currLeft){
                if(clip[1] >= time){
                    count++;
                    return count;
                }else if(clip[1] > currRight){
                    currRight = clip[1];
                }
            }else{
                currLeft = currRight;
                count++;
                if(clip[0] > currLeft){
                    return -1;
                }else {
                    if(clip[1] >= time){
                        count++;
                        return count;
                    }else{
                        currRight = clip[1];
                    }
                }
            }
        }
        return -1;
    }
}
