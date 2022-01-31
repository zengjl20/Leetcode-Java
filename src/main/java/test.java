import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(2.0 / 0.0);
        System.out.println(-2.0 / 0.0);
    }
}

class NodeDemo {

    public NodeDemo next;

    private int value;

    public NodeDemo(int x) {
        this.value = x;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}