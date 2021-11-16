public class stringMatch {
    public boolean stringMatch(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        boolean flag;
        for(int i = 0; i < sa.length - ta.length + 1; i++){
            flag = true;
            for(int j = 0; j < ta.length; j++){
                if(ta[j] != sa[i+j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
        }
        return false;
    }
}
