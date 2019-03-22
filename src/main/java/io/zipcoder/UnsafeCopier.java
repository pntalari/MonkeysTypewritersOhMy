package io.zipcoder;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {
    Integer wordCounter = 0;

    public UnsafeCopier(String toCopy) {

        super(toCopy);
    }

    public void run() {
        while(stringIterator.hasNext()) {
            copied += stringIterator.next() + ' ';
        }
    }
}
