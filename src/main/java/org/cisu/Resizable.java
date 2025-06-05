package org.cisu;

public interface Resizable {
    void resize(int size);
    void resize(int width, int height);
    void resizeTo(UIWidget widget);
}
