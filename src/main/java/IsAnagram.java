public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];
        for(int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j < t.length(); j++) {
            counts[t.charAt(j) - 'a']--;
        }
        for(int count :counts) {
            if(count != 0) return false;
        }
        return true;
    }
}
