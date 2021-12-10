import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }
        int longest = 0;
        for(int num : nums){
            if(hashSet.contains(num - 1)){
                continue;
            }
            int curNum = num;
            int curLongest = 1;
            while (hashSet.contains(curNum + 1)){
                curNum++;
                curLongest++;
            }
            if(curLongest > longest) longest = curLongest;
        }
        return longest;

    }
}
