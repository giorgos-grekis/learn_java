package org.cisu.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void show() {

        // Creating a Stream
        Stream.generate(() -> "Hello").limit(10).forEach(System.out::println);

        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));


//        List<Movie> movies = List.of(
//                new Movie("a", 10),
//                new Movie("b", 15),
//                new Movie("c", 20)
//        );
//
//        int count = 0;
//        for (var movie: movies)
//            if (movie.getLikes() > 10)
//                count++;
//
//        // Declarative (Functional) programming
//        var count2 = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();

    }
}
