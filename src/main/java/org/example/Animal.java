package org.example;

import java.util.Objects;

/**
 * Abstract classes
 * - cannot be instantiated
 *
 * Abstract methods
 * - have no method body
 * - need to be inside abstract classes or interfaces
 *
 * Avoids code duplication and increases reusability
 *
 * The purpose of an abstract class is to function as a base for subclasses.
 *
 * Encapsulate some common functionality in one place and let subclasses implement differences.
 */

// with abstract keyword we can't instantiate
abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // all extends classes MUST Override the makeSound method
    // Abstract methods can only exist with abstract classes
    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }


}
