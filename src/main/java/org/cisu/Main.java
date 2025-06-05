package org.cisu;

/**
 *  YAGNI
 *  You Aren't Gonna Need It
 */

public class Main {

    public static void main(String[] args) {
//        var box1 = new TextBox();
//        box1.setText("Hello World");
//        System.out.println(box1.toString());
//        var box2 = new TextBox();
//        // return a hash code represent a number for point the memory
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());
//
//        System.out.println(box1.equals(box2));

//        var control = new UIControl(true);
//        var textBox = new TextBox();
//        show(control);
//
//        var point1 = new Point(1,2);
//        var point2 = new Point(1,2);
//
//        System.out.println(point1 == point2);
//        System.out.println(point1.equals(point1));
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());


//        UIControl[] controls = {new TextBox(), new TextBox(), new TextBox()};
//        for (var control : controls) {
//            control.enable();
//

        // poor mans dependencies injection
        var calculator = new TaxCalculator2018(100_000);
//        var report = new TaxReport(calculator);
//        report.show();
//
//        report.setCalculator(new TaxCalculator2018(0));
//        report.show();

        // Method Injection
        var report = new TaxReport();
        report.show(calculator);

        report.show(new TaxCalculator2018(0));


    }

//     public static void show(UIControl control) {
//        if (control instanceof TextBox) {
//            var textBox = (TextBox) control;
//            textBox.setText("Hello World");
//        }
//         System.out.println(control);
//     }
}