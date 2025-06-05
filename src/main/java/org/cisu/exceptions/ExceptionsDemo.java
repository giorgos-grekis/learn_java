package org.cisu.exceptions;

import java.io.IOException;

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
    public static void show() throws IOException {
//        FileReader reader = null;
//        try {
//            reader = new FileReader("file.txt");
//            var value = reader.read();
//            reader.close();
//            new SimpleDateFormat().parse("");
//        }
////        catch (FileNotFoundException e) {
////            throw new RuntimeException(e);
////        }
//        catch (IOException | ParseException e) {
//            System.out.println(e.getMessage());
//        }
////        catch (ParseException e) {
////            throw new RuntimeException(e);
////        }
//        finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }


//        //   // add a final bloack and automatically close the reader
//        // reader.close();
//        try (
//                var reader = new FileReader("file.txt");
//                var writer = new FileWriter("file.txt");
//        ) {
//            var value = reader.read();
//            reader.close();
//            new SimpleDateFormat().parse("");
//        }
//        catch (IOException | ParseException e) {
//            System.out.println(e.getMessage());
//        }
//
        var account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("Logging");
            throw e;
        }

    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
