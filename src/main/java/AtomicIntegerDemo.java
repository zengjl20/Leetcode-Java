import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    // 线程不安全
    private static int value1 = 0;
    // 乐观锁
    private static AtomicInteger value2 = new AtomicInteger(0);
    // 悲观锁
    private static int value3 = 0;
    private static synchronized void increaseValue(){
        value3++;
    }

    public static void main(String[] args) throws InterruptedException {
        // 开启1000线程，执行自增操作
        for(int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    value1++;
                    value2.getAndIncrement();
                    increaseValue();
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println("线程不安全：" + value1);
        System.out.println("乐观锁(AtomicInteger)：" + value2);
        System.out.println("悲观锁(synchronized)：" + value3);
    }
}
