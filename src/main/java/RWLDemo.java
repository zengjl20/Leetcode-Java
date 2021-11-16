import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLDemo {
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args){
        final RWLDemo rwlDemo = new RWLDemo();

        new Thread("A"){
            public void run(){
                rwlDemo.get(Thread.currentThread());
            }
        }.start();

        new Thread("B"){
            public void run(){
                rwlDemo.get(Thread.currentThread());
            }
        }.start();
    }

    private void get(Thread currentThread) {
        readWriteLock.readLock().lock();
        try{
            System.out.println("线程" + currentThread.getName() + "开始读操作");
            Thread.sleep(2000);
            System.out.println("线程" + currentThread.getName() + "读操作完毕");
        } catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            readWriteLock.readLock().unlock();
        }
    }
}
