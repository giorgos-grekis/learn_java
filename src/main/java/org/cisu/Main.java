package org.cisu;


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

        var control = new UIControl(true);
        var textBox = new TextBox();
        show(control);
    }

     public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
         System.out.println(control);
     }
}