import java.util.Arrays;

public class ReconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (int[] person1, int[] person2) -> {
            if(person1[0] != person2[0]) return person1[0] - person2[0];
            else return person2[1] - person1[1];
        });
        int n = people.length;
        int[][] res = new int[n][];
        for(int[] person : people) {
            int i = person[1], idx = 0;
            while (i != 0 || res[idx] != null) {
                if(res[idx] == null) i--;
                idx++;
            }
            res[idx] = person;
        }
        return res;
    }
}
