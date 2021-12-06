import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] a = {10,9,10,4,3,8,3,3,6,2,10,10,9};
        String p = "abc";
        int x = 1;
        for(int b : a){
            x  = x* b;
        }
        NumSubarrayProductLessThanK n = new NumSubarrayProductLessThanK();
        Person jack = new Person("jack", 2384);
        Person ma = jack;
        Arrays.sort(a);
        System.out.println(a);
    }
}
