import java.util.Arrays;

public class LeastInterval {
    public int leastInterval(char[] tasks, int n) {
        int[] nums = new int[26];
        for(char c : tasks) {
            nums[c - 'A']++;
        }
        Integer[] temp = new Integer[nums.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums[i];
        }
        int count = 0;
        while (true) {
            Arrays.sort(temp, (i, j) -> j - i);
            for(int i = 0; i <= n; i++) {
                if(temp[i] != 0) {
                    temp[i]--;
                }
                count++;
            }
            if(temp[0] == 0) break;
        }
        return count;
    }
}
