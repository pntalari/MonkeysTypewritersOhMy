package io.zipcoder;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier {
    private final Lock lock = new ReentrantLock();
    String safeCopy = "";
    Integer counter = 0;

    public SafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {

        lock.lock();
        while(stringIterator.hasNext()) {
            copied += stringIterator.next() + ' ';
        }
        lock.unlock();
//        //
//        Runnable task = () -> {
//            //   lock.lock();
//            while (this.stringIterator.hasNext()) {
//                safeCopy += " " + this.stringIterator.next();
//                counter++;
//                System.out.println("Number of words safe copied: " + counter);
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e) {
//
//                }
//            }
//        };
//        Executor executor = Executors.newCachedThreadPool();
//        executor.execute(task);
//        //   lock.unlock();

    }
}
