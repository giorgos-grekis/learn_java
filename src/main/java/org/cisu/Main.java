package org.cisu;

/** class
 *  A blueprint for creating objects
 */

/** Object
 * An instance of a class
 */

/***
 *  Heap => store Objects
 *  Stack => Primitives and short-lived variables
 */

public class Main {

    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Hello World Box1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Hello World Box2");
        System.out.println(textBox2.text);

        var textBox3 = textBox1;
        textBox3.setText("Hello World Box3");

        System.out.println(textBox1.text);
    }
}