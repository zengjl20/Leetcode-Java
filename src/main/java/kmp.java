public class kmp {
    public boolean kmp(String s, String p){
        char[] sa = s.toCharArray();
        char[] pa = p.toCharArray();
        int[] next = buildNext(pa);

        return search(sa, pa, next);
    }

    public boolean search(char[] sa, char[] pa, int[] next) {
        int tar = 0, pos = 0;
        while (tar <= sa.length - pa.length){
            if(sa[tar] == pa[pos]){
                tar++;
                pos++;
            }else if(pos != 0){
                pos = next[pos-1];
            }else {
                tar++;
            }
            if(pos == pa.length){
                return true;
            }
        }
        return false;

    }

    public int[] buildNext(char[] pa) {
        int[] next = new int[pa.length];
        int i = 1, now = 0;

        while (i < pa.length){
            if(pa[i] == pa[now]){
                now++;
                next[i] = now;
                i++;
            } else if (now != 0) {
                now = next[now-1];
            }else {
                next[i] = 0;
                i++;
            }
        }
        return next;
    }
}
