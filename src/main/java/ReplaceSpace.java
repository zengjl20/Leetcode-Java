public class ReplaceSpace {
    public String replaceSpace(String s) {
        char[] chars = new char[3 * s.length()];
        int size = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                chars[size++] = '%';
                chars[size++] = '2';
                chars[size++] = '0';
            }else {
                chars[size++] = s.charAt(i);
            }
        }
        String newStr = new String(chars, 0, size);
        return newStr;
    }
}
