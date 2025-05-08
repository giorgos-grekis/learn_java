package org.example.string;

public class Strings {
    // String
    String name1 = "George";

    // Memory Stack
    // frame for main()
    // String Pool => Special memory region where Strings are stored by the JVM.

    // this will be point to the Heap instead to the String Pool
    String name2 = new String("George");


    // Join
    String[] names = {"George","Alexandra"};
    String joinedNames = String.join(", ", names);


}
