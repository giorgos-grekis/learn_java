package org.cisu.concurrency;

public class DownloadFileTask implements Runnable {
    private final DownloadStatus status;

    public DownloadFileTask() {
        this.status = new DownloadStatus();
    }



    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
//            System.out.println("Downloading byte: " + i);
            status.incrementTotalBytes();;
        }


        System.out.println("Download complete: " + Thread.currentThread().getName());
    }


    public DownloadStatus getStatus() {
        return status;
    }
}
