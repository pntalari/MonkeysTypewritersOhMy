package io.zipcoder;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * We're using this as an abstract base class since both the safe and unsafe copiers will implement it.
 */
public abstract class Copier implements Runnable {
    // We use an iterator so each monkey / thread can copy an individual word.
    public Iterator<String> stringIterator;
    public String copied;

    public Copier(String toCopy) {
        // Take the input string, split it on spaces, turn that array to an arraylist, and then grab its iterator.
        this.stringIterator = Arrays.asList(toCopy.split(" ")).iterator();
        this.copied = "";
    }



//    public void run() {
//        Runnable task = () -> {
//            while (this.stringIterator.hasNext()) {
//                copied += " " + this.stringIterator.next();
//                // wordCounter++;
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                //  System.out.println("Number of words copied: " + wordCounter);
//            }
//        };
//        Executor executor = Executors.newCachedThreadPool();
//        executor.execute(task);
//    }
}
