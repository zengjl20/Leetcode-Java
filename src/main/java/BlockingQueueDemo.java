import javafx.beans.binding.ObjectExpression;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueueDemo<E> {

    private Object[] items;
    private ReentrantLock lock;
    private Condition notFull;
    private Condition notEmpty;
    int count, putIndex, takeIndex;

    public BlockingQueueDemo(int capacity, boolean fair) {
        if(capacity <= 0)
            throw new IllegalArgumentException();
        this.items = new Object[capacity];
        lock = new ReentrantLock(fair);
        notFull = lock.newCondition();
        notEmpty = lock.newCondition();
    }

    public void put(E e) throws InterruptedException {
        if(e == null) return;
        final ReentrantLock lock = this.lock;
        lock.lockInterruptibly();
        try {
            while (count == items.length)
                notFull.await();
            enqueue(e);
        } finally {
            lock.unlock();
        }
    }

    private void enqueue(E x) {
        final Object[] items = this.items;
        items[putIndex] = x;
        if(putIndex++ == items.length)
            putIndex = 0;
        count++;
        notEmpty.signal();
    }

    public E take() throws InterruptedException {
        final ReentrantLock lock = this.lock;
        lock.lockInterruptibly();
        try {
            while (count == 0)
                notEmpty.await();
            return dequeue();
        }finally {
            lock.unlock();
        }
    }

    private E dequeue() {
        final Object[] items = this.items;
        @SuppressWarnings("unchecked")
        E x = (E) items[takeIndex];
        items[takeIndex] = null;
        if(takeIndex++ == items.length)
            takeIndex = 0;
        count--;
        notFull.signal();
        return x;
    }
}
