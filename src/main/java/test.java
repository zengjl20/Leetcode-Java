import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class test {
    public static void main(String[] args) throws InterruptedException {
        test test = new test();
        System.out.println(test.sum());
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
    }

    public int sum() {
        return 9;
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