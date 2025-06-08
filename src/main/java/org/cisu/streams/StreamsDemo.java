package org.cisu.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20)
        );

//        // Simple Reduces
//        movies.stream()
////                .anyMatch(m -> m.getLikes() > 20)
////                .allMatch(movie -> movie.getLikes() == 10);
////                .noneMatch(movie -> movie.getTitle().equals("a"));
////                .findFirst()



//        // Peeking Elements
//        movies.stream()
//                .filter(m -> m.getLikes() > 10)
//                .peek(m -> System.out.println("filtered : " + m.getTitle()))
//                .map(Movie::getTitle)
//                .peek(t -> System.out.println("mapped : " + t))
//                .forEach(System.out::println);


//        // distinct => Getting Unique Elements
//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct()
//                .forEach(System.out::println);


//        // Sorting Streams
//        movies.stream()
////                .sorted((a,b) -> a.getTitle().compareTo(b.getTitle()))
//                .sorted(Comparator.comparing(Movie::getTitle))
//                .forEach(m-> System.out.println(m.getTitle()));

//        // Slicing Streams
//        // 1000 moives
//        // 10 movies per page
//        // 3rd page
//        // skip(20) = skip ( (page -1) x pageSize )
//        // limit(10) = limit(pageSize)
//        movies.stream()
//                .takeWhile(movie -> movie.getLikes() < 30)
//                .dropWhile(movie -> movie.getLikes() < 30)
//                .skip(2)
//                .limit(10)
//                .forEach(m -> System.out.println(m.getTitle()));

//        // Filtering Element
//
//        movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                 .forEach(m -> System.out.println(m.getTitle()));


//        // Mapping Elements
//        movies.stream()
//                .map(Movie::getTitle)
//                .forEach(System.out::println);
//
//        var stream = Stream.of(List.of(1, 2, 3), List.of(4,5,6));
//        stream
//                .flatMap(Collection::stream)
//                .forEach(System.out::println);

//        // Creating a Stream
//        Stream.generate(() -> "Hello").limit(10).forEach(System.out::println);
//
//        int[] numbers = {1, 2, 3};
//        Arrays.stream(numbers)
//                .forEach(n -> System.out.println(n));



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
