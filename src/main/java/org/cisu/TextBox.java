package org.cisu;

public class TextBox {
    // by default the value set to null
    public String text = ""; // Field

    public void setText(String text) {
        // this is a reference for the current object
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
