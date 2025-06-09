package org.cisu.executors;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FightService {

     public Stream<CompletableFuture<Quote>> getQuotes() {
        var sites = List.of("site1", "site2", "site3");

        return sites.stream().map(this::getQuote);
    }

    public CompletableFuture<Quote> getQuote(String site) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from : " + site);

            LongTask.simulate();

            var random = new Random();
            var price = BigDecimal.valueOf(100 + random.nextInt(10));

            return new Quote(site, price);
        });
    };
}
