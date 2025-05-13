package org.example.hashCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class hashCodes {

    public static void main(String[] args) {
        Map<Person,Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("Afican Diamond"));

        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jamila").hashCode());
        System.out.println(map.get(new Person("Jamila")));
    }

//    record Person(String name) {}
    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

    record Diamond(String name) {}
}
