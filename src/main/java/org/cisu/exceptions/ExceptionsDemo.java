package org.cisu.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }
//        catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        catch (IOException | ParseException e) {
            System.out.println(e.getMessage());
        }
//        catch (ParseException e) {
//            throw new RuntimeException(e);
//        }

    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
