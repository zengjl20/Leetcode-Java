import java.util.concurrent.*;

public class TestMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future = executorService.submit(new AddNumberTask());
        System.out.println(Thread.currentThread().getName() + "线程执行其他任务");
        Integer integer = future.get();
        System.out.println(integer);
        if(executorService != null){
            executorService.shutdown();
        }
    }
}

class AddNumberTask implements Callable<Integer> {
    public AddNumberTask(){}

    @Override
    public Integer call() throws Exception{
        System.out.println("###AddNumberTask.call()###");
        Thread.sleep(5000);
        return 50000;
    }
}