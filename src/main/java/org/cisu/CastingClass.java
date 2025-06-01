package org.cisu;

public class CastingClass {

    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
//        double x = 1.1;
//        int y = (int)x+ 2;
//
//        System.out.println(y);

        //  Wrapper Classes
        String x = "1";
        int y = Integer.parseInt(x)+ 2;
        String x2 = "1.1";
        double z = Double.parseDouble(x2)+ 2;

        System.out.println(y);
        System.out.println(z);
    }
}
