package org.example.sets;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        // TreeSet give order
        // HashSet
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    static class Ball {
        String color;
        public Ball(String color) {
            this.color  = color ;
        }

        // In order to used set correctly we need to override the equals

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(color);
        }
    }
//    record Ball(String color) {}
}
