package org.example.classes;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat() {}

    public Cat(String name) {
        this.name = name;
        this.age = 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                 Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String color) {
        // It looks for "public Cat(String name, int age)" constructor and set the values of the name and age
        this(name, age);
        this.color = color;
    }



    public void meow() {
        System.out.println(name + ": meow...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
