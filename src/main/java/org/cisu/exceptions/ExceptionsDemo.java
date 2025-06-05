package org.cisu.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Three Types of Exceptions
 * Checked => not at compile time "new FileReader("file.txt")"
 * Unchecked =>  at compile time "sayHello(null)"
 * Error
 */

/**
 *  Exceptions Hierarchy
 *  Throwable
 *  Exception (checked) - Error
 *  RuntimeException (unchecked)
 */

public class ExceptionsDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


//        try {
//            var reader = new FileReader("file.txt");
//            System.out.println("File opened");
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }

    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
