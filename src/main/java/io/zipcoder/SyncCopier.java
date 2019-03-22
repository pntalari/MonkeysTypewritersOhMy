package io.zipcoder;

public class SyncCopier extends Copier {

    public SyncCopier(String toCopy) {
        super(toCopy);
    }

    @Override
    synchronized public void run() {
        while(stringIterator.hasNext()) {
            copied += stringIterator.next() + ' ';
        }
    }

}
