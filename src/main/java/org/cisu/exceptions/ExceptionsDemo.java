package org.cisu.exceptions;

import java.io.FileReader;

/**
 * Three Types of Exceptions
 * Checked => at compile0 time "new FileReader("file.txt")"
 * Unchecked => not at compile time "sayHello(null)"
 * Error
 */

public class ExceptionsDemo {
    public static void show() {
//        var reader = new FileReader("file.txt");
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
