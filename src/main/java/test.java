import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class test {
    public static void main(String[] args) throws InterruptedException {
        Caculate caculator = new Caculate();
        String s = " 3+5 / 2 ";
        int x = caculator.calculate(s);
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