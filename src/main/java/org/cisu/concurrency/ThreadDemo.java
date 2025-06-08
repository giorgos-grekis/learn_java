package org.cisu.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {
        List<Thread> threads = new ArrayList<Thread>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);

            var thread = new Thread(task);
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

        var totalBytes = tasks.stream()
                        .map(t -> t.getStatus().getTotalBytes())
//                .reduce(0, (a,b) -> a + b);
                .reduce(0, Integer::sum);


        System.out.println(totalBytes);


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
