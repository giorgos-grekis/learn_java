package org.cisu.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void show() {
        // Running Code on Completion
        var future = CompletableFuture.supplyAsync(() -> 1);
        CompletionStage x;
//        future.thenRunAsync(() -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Done");
//        });
        future.thenAcceptAsync(result -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });


////        ForkJoinPool.commonPool()
//        Supplier<Integer> task = () -> 1;
//        var future = CompletableFuture.supplyAsync(task);
//        try {
//           var result = future.get();
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
    }
}
