import java.util.concurrent.locks.ReentrantReadWriteLock;

public class test {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer stringBuffer = new StringBuffer();
        int h;
        System.out.println(stringBuffer.hashCode());
        System.out.println((h = stringBuffer.hashCode()) ^ (h >>> 16));
        NodeDemo node = new NodeDemo(2);
        node.next = new NodeDemo(3);
        NodeDemo p = node.next;
        p.setValue(4);
        System.out.println(node.next.getValue());
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