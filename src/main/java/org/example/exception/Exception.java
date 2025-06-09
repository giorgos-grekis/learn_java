package org.example.exception;

// When To Use Checked VS Unchecked Exceptions
public class Exception {
    //       // Exception
//        for (int i = 10; i >= 0; i--) {
//            try {
//                System.out.println(10 / i);
//            } catch (ArithmeticException e) {
//                System.out.println("Arithmetic Exception");
//            }
//        }

//        // NumberFormatException
//        try {
//            int number = Integer.parseInt("1x");
//            System.out.println(number);
//        } catch (NumberFormatException e) {
//            System.out.println("Failed to parse 1x error message: " +e.getMessage());
//        }

    // Multiple Catch Blocks


//        try {
//            int number = Integer.parseInt("1x");
//            System.out.println(number);
//                for (int i = 10; i >= 0; i--) {
//                    System.out.println(10 / i);
//                }
//                    } catch (NumberFormatException | ArithmeticException e) {
//                    System.out.println("error message: " +e.getMessage());
//                }


//        // Exception
//                try {
//            int number = Integer.parseInt("1x");
//            System.out.println(number);
//                for (int i = 10; i >= 0; i--) {
//                    System.out.println(10 / i);
//                }
//                    } catch (Exception e) {
//                    System.out.println("error message: " +e.getMessage());
//                } finally {
//                    System.out.println("finally , always runs");
//                }



//                // checked exceptions
//                File file = new File("src/hello.txt");
//                try {
//                    if (!file.exists()) {
//                        file.createNewFile();
//                    }
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
//
//    static void anna() {
//        try {
//            giorgos();
//        }catch (java.lang.Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    static void giorgos() throws java.lang.Exception {
//        john();
//    }
//
//    static void john() throws java.lang.Exception {
//        divide(10,0);
//    }
//
//
//    public static double divide(int a, int b) throws MyCheckedException {
//        if (b == 0) {
////            throw new IllegalArgumentException("Cannot divide by zero");
//            throw  new MyCheckedException("Cannot divide by zero");
//        }
//        return a / b;
//    }


}
