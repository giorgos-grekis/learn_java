package org.cisu;

public class MathClass {
    public static void main(String[] args) {
        int round = Math.round(1.1F);
        System.out.println(round);

        int ceil = (int)Math.ceil(1.1F);
        System.out.println(ceil);

        int floor = (int)Math.floor(1.1F);
        System.out.println(floor);

        int max = Math.max(1,2);
        System.out.println(max);

        int min = Math.max(1,2);
        System.out.println(min);

        double random = Math.random();
        System.out.println(random);

        int random2 = (int) Math.round(Math.random() * 100);
        System.out.println(random2);

    }
}
