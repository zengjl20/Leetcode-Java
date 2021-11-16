public class videoStitchingDP {
    public int videoStitching(int[][] clips, int time) {
        if(time == 0){
            return 0;
        }
        int result = 100000;
        for(int[] clip : clips){
            if(clip[0] < time && clip[1] >= time){
                if(result > videoStitching(clips, clip[0]) + 1 && videoStitching(clips, clip[0]) != -1){
                    result = videoStitching(clips, clip[0]) + 1;
                }
            }
        }
        if(result == 100000){
            return -1;
        }
        return result;
    }
}
