import java.util.concurrent.locks.ReentrantReadWriteLock;

public class test {
    public static void main(String[] args) throws InterruptedException {
        String value1 = "3[a2[c]]";
        String value2 = "https://github.com/Snailclimb";
        DecodeString decodeString = new DecodeString();
        System.out.println('A' - 'B');
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