public class ReverseWord {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder("");
        s = s.trim();
        int i = s.length() - 1, j = s.length() - 1;
        while (i >= 0){
            while (i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            stringBuilder.append(s.substring(i+1, j+1) + " ");
            while ( i>= 0 && s.charAt(i) == ' '){
                i--;
            }
            j = i;
        }
        return stringBuilder.toString().trim();
    }
}
