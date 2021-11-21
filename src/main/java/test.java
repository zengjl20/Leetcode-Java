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
        System.out.println(n.numSubarrayProductLessThanK(a, 19));
        System.out.println(x);
    }
}
