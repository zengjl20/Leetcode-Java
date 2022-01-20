import java.util.concurrent.locks.ReentrantReadWriteLock;

public class test {
    public static void main(String[] args) throws InterruptedException {
        String value1 = "42";
        String value2 = "https://github.com/Snailclimb";
        MyAtoi myAtoi = new MyAtoi();
        boolean[] s = new boolean[2];
        System.out.println();
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