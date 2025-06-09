package org.cisu.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {

    public static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getPlayListAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist ");
    }

    public static void show() {

        // Handling timeouts
        var future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
        });

        try {
            var result = future
                    .completeOnTimeout(1,1, TimeUnit.SECONDS)
                    .get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

//        // waiting for the first task
//        var first = CompletableFuture.supplyAsync(() -> {
//            LongTask.simulate();
//            return 20;
//        });
//
//        var second = CompletableFuture.supplyAsync(() -> 20);
//
//        var fastest = CompletableFuture
//                .anyOf(first, second)
//                .thenAccept(temp -> System.out.println(temp));


//        // Waiting for Many Tasks
//        var first = CompletableFuture.supplyAsync(() -> 1);
//        var second = CompletableFuture.supplyAsync(() -> 2);
//        var third = CompletableFuture.supplyAsync(() -> 3);
//
//        var all = CompletableFuture.allOf(first, second, third);
//
//        all.thenRun(() -> {
//            try {
//                var firstResult = first.get();
//                System.out.println(firstResult);
//            } catch (InterruptedException | ExecutionException e) {
//                throw new RuntimeException(e);
//            }
//
//            System.out.println("All Done!");
//        });

//        // Combining Completable future
//        var first = CompletableFuture
//                .supplyAsync(() -> "20USD")
//                .thenApply(str -> {
//                   var price = str.replace("USD", "");
//                   return Integer.parseInt(price);
//                });
//
//        var second = CompletableFuture.supplyAsync(() -> 0.9);
//
//        first
//            .thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
//            .thenAccept(result -> System.out.println(result));


//        // Composing Completable Future
////        CompletableFuture.supplyAsync(() -> "email")
////            .thenCompose(email -> CompletableFuture
////            .supplyAsync(() -> "playlist"))
////            .thenAccept(playlist -> System.out.println(playlist));
//
//        getUserEmailAsync()
//            .thenCompose(CompletableFutureDemo::getPlayListAsync)
//            .thenAccept(playlist -> System.out.println(playlist));



//        // Transforming a Completable future
//        var future = CompletableFuture.supplyAsync(() -> 20);
//        future
//                .thenApply(CompletableFutureDemo::toFahrenheit)
//                .thenAccept(System.out::println);

//        // Handling Exceptions
//        var future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Getting the current weather");
//            throw new IllegalStateException();
//        });
//
//        try {
//            var temperature = future.exceptionally(ex -> 1).get();
//            System.out.println(temperature);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

//        // Running Code on Completion
//        var future = CompletableFuture.supplyAsync(() -> 1);
//        CompletionStage x;
////        future.thenRunAsync(() -> {
////            System.out.println(Thread.currentThread().getName());
////            System.out.println("Done");
////        });
//        future.thenAcceptAsync(result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);
//        });


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
