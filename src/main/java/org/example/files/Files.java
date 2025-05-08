package org.example.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *  main.java
 *    // Working with Files
 *         File file = createFile("src/foo.txt");
 *         writeToFile(file, false);
 *
 *         try {
 *             Scanner scanner = new Scanner(file);
 *             while (scanner.hasNextLine()) {
 *                 System.out.println(scanner.nextLine());
 *             }
 *         } catch (FileNotFoundException e) {
 *             System.out.println(e.getMessage());
 *         }
 */
public class Files {

    private static void writeToFile(File file, boolean append) {
        // anything that implements Closeable, Flushable we can use Try with Resources
        try (
                FileWriter fileWriter = new FileWriter(file, append);
                PrintWriter writer = new PrintWriter(fileWriter);
        ){
            writer.println("Hello");
            writer.println("World");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        try {
//            FileWriter fileWriter = new FileWriter(file, append);
//            PrintWriter writer = new PrintWriter(fileWriter);
//            writer.println("Hello");
//            writer.println("World");
//
//            writer.flush();
//            writer.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
    }

    public static File createFile(String path) {
        try {
            File file = new File(path);

            if (!file.exists()) {
                file.createNewFile();
            }
//            if (file.exists()) {
//                file.delete();
//            }
            return file;
        }catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}
