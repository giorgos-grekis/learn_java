package org.cisu.streams;

import java.util.List;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        int count = 0;
        for (var movie: movies)
            if (movie.getLikes() > 10)
                count++;

        // Declarative (Functional) programming
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();

    }
}
