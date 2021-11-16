public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        char[] chars = new char[len];
        for(int i = 0; i < len; i++){
            chars[i] = s.charAt((i+n)%len);
        }
        String str = new String(chars);
        return str;
    }
}
