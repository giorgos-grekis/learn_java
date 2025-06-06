package org.cisu;

import org.cisu.generics.GenericList;
import org.cisu.generics.List;
import org.cisu.generics.User;

public class Main {

    public static void main(String[] args) {
//        try {
//            ExceptionsDemo.show();
//        } catch (Throwable e) {
////           e.printStackTrace();
//            System.out.println("An unexpected error occurred");
//        }

//        var list = new GenericList<User>();
//        list.add(new User());
//        User user = list.get(0);

//        GenericList<Integer> numbers = new GenericList<>();
//        numbers.add(1); // Boxing
//        int number = numbers.get(0); // Unboxing


        var user1 = new User(10);
        var user2 = new User(20);

        if (user1.compareTo(user2) < 0)
            System.out.println("user1 < user2");
        else if (user1.compareTo(user2) == 0)
            System.out.println("user1 == user2");
        else
            System.out.println("user1 > user2");


    }

}