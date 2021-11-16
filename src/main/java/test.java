import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,3,4,5};
        String p = "abcdefgabcdefgabcdef";
        GetNumberOfK getNumberOfK = new GetNumberOfK();
        System.out.println(getNumberOfK.GetNumberOfK(a, 3));
    }
}
