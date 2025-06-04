package org.cisu;

public class TextBox extends UIControl {
    private String text = "";

    /**
     * private members (private fields and private methods)
     * are not inheritance by subClasses
     * and are not accessible outside a class
     */
    public TextBox() {
        super(true);
//        System.out.println("TextBox");
    }

    /**
     * annotation is a label that is attached to the class member
     */
    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }


}
