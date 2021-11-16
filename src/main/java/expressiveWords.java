import java.util.ArrayList;
import java.util.List;

public class expressiveWords {
    public static int expressiveWords(String s, String[] words) {
        int i = 0;
        RLE R = new RLE(s);
        for(String word:words){
            RLE R1 = new RLE(word);
            boolean flag = true;
            if(R.key.equals(R1.key)){
                for(int j = 0; j < R.key.length(); j++){
                    int c1 = R.counts.get(j);
                    int c2 = R1.counts.get(j);
                    if((c1 > c2 && c1 < 3) || (c1 < c2)){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    i++;
                }
            }
        }
        return i;
    }

    public static void main(String[] args){
        String s = "heeellooo";
        String[] words = {"hello", "hi", "heello"};
        System.out.println(expressiveWords(s, words));
    }
}
