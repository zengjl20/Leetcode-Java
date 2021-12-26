import java.util.concurrent.locks.ReentrantReadWriteLock;

public class test {
    public static void main(String[] args) throws InterruptedException {
        String[] a = {"10", "0001", "111001", "1", "0"};
        FindMaxForm findMaxForm = new FindMaxForm();
        int x = 1;
        System.out.println(findMaxForm.findMaxForm(a, 5, 3));
    }
}