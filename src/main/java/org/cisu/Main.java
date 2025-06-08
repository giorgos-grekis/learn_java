package org.cisu;

import org.cisu.collections.CollectionsDemo;
import org.cisu.generics.*;
import org.cisu.lambdas.LambdasDemo;

/**
 *          Iterable
 *          Collections
 *  List        Queue           Set
 *  ArrayList   PriorityQueue   HashSet
 *  LinkedList
 *
 */

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


//        var user1 = new User(10);
//        var user2 = new User(20);
//
//        if (user1.compareTo(user2) < 0)
//            System.out.println("user1 < user2");
//        else if (user1.compareTo(user2) == 0)
//            System.out.println("user1 == user2");
//        else
//            System.out.println("user1 > user2");
//
//        var max = Utils.max(1, 3);
//        System.out.printf("max: %d\n", max);
//
//        var maxuser = Utils.max(user1, user2);
//        System.out.println("maxUser: " + maxuser);
//
//
//        Utils.print(1, "cisu");
//
//        User user = new Instructor(10);
//        Utils.printUser(user);

//        var instructors = new GenericList<Instructor>();
//        var users = new GenericList<User>();
//        Utils.printUsers(users);

//        // Iterables
//        var list = new GenericList<String>();
//        var iterator = list.iterator();
//        list.add("a");
//        list.add("b");
//
//        while (iterator.hasNext()) {
//            var current = iterator.next();
//            System.out.println(current);
//        }
//
//        for (var item : list)
//            System.out.println(item);

//        // CollectionsDemo
//         CollectionsDemo.show();

        var demo = new LambdasDemo();
        demo.show();


    }

}