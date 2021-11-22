import java.util.Arrays;

public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        int[] vocabS1 = new int[26];
        int[] vocabS2 = new int[26];
        int len = s1.length(), length = s2.length();
        for(int i = 0; i < len; i++){
            char a = s1.charAt(i);
            vocabS1[a - 'a']++;
            char b = s2.charAt(i);
            vocabS2[b - 'a']++;
        }
        if(Arrays.equals(vocabS1, vocabS2)) return true;
        for(int i = len; i < length; i++){
            vocabS2[s2.charAt(i) - 'a']++;
            vocabS2[s2.charAt(i - len) - 'a']--;
            if(Arrays.equals(vocabS1, vocabS2)) return true;
        }
        return false;
    }
}
