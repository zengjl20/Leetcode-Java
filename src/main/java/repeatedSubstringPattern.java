import java.util.List;

public class repeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        char[] sa = s.toCharArray();
        boolean flag = false;
        for (int n = 1; n * 2 <= sa.length; n++) {
            if (sa.length % n == 0) {
                flag = true;
                for(int j = n; j < sa.length; j++){
                    if(sa[j] != sa[j-n]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return true;
                }
            }
        }
        return false;
    }
}
