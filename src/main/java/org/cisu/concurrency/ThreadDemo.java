package org.cisu.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {

        // Race Conditions
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<Thread>();

        for (var i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(status.getTotalBytes());


//        System.out.println(Thread.currentThread().getName());
//
////        for (var i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask());
//            thread.start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        thread.interrupt();
//
////            try {
////                thread.join();
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
////
////            System.out.println("File is ready to be scanned.");
////        }

    }
}
