package org.cisu.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    //    private Lock lock = new ReentrantLock();
    private int totalFiles;
    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
//        lock.lock();
//        try {
//            totalBytes++;
//        }
//        finally {
//            lock.unlock();
//        }


        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }

    public synchronized void incrementTotalFiles() {
            totalFiles++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }
}
