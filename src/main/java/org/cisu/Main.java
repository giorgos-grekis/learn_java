package org.cisu;


import org.cisu.exceptions.ExceptionsDemo;

public class Main {

    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
//           e.printStackTrace();
            System.out.println("An unexpected error occurred");
        }
    }

}