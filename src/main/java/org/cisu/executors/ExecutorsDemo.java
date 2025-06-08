package org.cisu.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(2);

        try {
            var future = executor.submit(() -> {
                LongTask.simulate();
                return 1;
            });

            System.out.println("Do more work");

            var result = future.get();
            System.out.println(result);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executor.shutdown();
        }



    }
}
