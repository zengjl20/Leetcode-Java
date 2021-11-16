public class transfer {
    public static void main(String[] args){
        String s = "[1,2,3,3,3,3,4,5]";
        char[] sa = s.toCharArray();
        for(int i = 0; i < sa.length; i++){
            if(sa[i] == '['){
                sa[i] = '{';
            }else if(sa[i] == ']'){
                sa[i] = '}';
            }
        }
        System.out.println(String.valueOf(sa) + ';');
    }
}
