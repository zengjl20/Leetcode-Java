import java.util.concurrent.locks.ReentrantReadWriteLock;

public class test {
    public static void main(String[] args) throws InterruptedException {
        String value1 = "https://javaguide.cn/";
        String value2 = "https://github.com/Snailclimb";
        MyBloomFilter filter = new MyBloomFilter();
        System.out.println(filter.contains(value1));
        System.out.println(filter.contains(value2));
        filter.add(value1);
        filter.add(value2);
        System.out.println(filter.contains(value1));
        System.out.println(filter.contains(value2));
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