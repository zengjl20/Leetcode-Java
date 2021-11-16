import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
    private static final int threadCount = 6;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        for(int i = 0; i < threadCount; i++){
            final int threadNum = i;
            threadPool.execute(() -> {
                try{
                    System.out.println(threadNum + " Start reading");
                    Thread.sleep(5000);
                    System.out.println(threadNum + " Read completed");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    countDownLatch.countDown();
                }
            });
        }
        threadPool.execute(() -> {
            try{
                System.out.println(7 + " Start reading");
                Thread.sleep(6000);
                System.out.println(7 + " Read completed");
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                countDownLatch.countDown();
            }
        });
        countDownLatch.await();
        threadPool.shutdown();
        System.out.println("finish");
    }
}
