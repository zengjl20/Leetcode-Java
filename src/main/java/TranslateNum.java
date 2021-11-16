public class TranslateNum {
    public int translateNum(int num) {
        String s = num + "";
        int p = 0, q = 0, r = 1;
        for(int i = 0; i < s.length(); i++){
            p = q;
            q = r;
            r = 0;
            r += q;
            if(i == 0){
                continue;
            }
            String pre = s.substring(i - 1, i + 1);
            if(pre.compareTo("25") <= 0 && pre.compareTo("10") >= 0){
                r += p;
            }
        }
        return r;
    }
}
