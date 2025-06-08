package org.cisu.concurrency;

public class ThreadDemo {
    public static void show() {

        System.out.println(Thread.currentThread().getName());

//        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt();

//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//            System.out.println("File is ready to be scanned.");
//        }

    }
}
