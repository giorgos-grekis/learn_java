package org.example.classes;

public class StaticInitlaizationBlock {

    public static int count;

    static {
        System.out.println("start: static initialization");
        count = 0;
        // we CAN'T hava a return statement

        System.out.println("end: static initialization");
    }


}


/**
 *  This goes to main
 *  //        Cat fluffy = new Cat("Fluffy", 2, "Blue");
 * ////        fluffy.setName("Fluffy");
 * //        fluffy.meow();
 * //        System.out.println(fluffy.getName());
 * //        System.out.println(fluffy.getAge());
 * //        System.out.println(fluffy.getColor());
 * //        fluffy.toString();
 * //
 * //        System.out.println(fluffy);
 * //
 * //        String[] names = {"Foo","Bar"};
 * //        System.out.println(Arrays.toString(names));
 *
 * //        Cat star = new Cat("Star");
 * ////        star.setName("Star");
 * //        star.meow();
 * //        System.out.println(star.getName());
 *
 * //        Cat jupiter = new Cat("Jupiter");
 * //        jupiter.meow();
 * //        System.out.println(jupiter.getName());
 * //        System.out.println(jupiter.getAge());
 *
 *
 * //
 * //        // Comparing Object with ==
 * //        Cat rose1 = new Cat("Rose",2, "Blue");
 * //        System.out.println(rose1);
 * //
 * //        Cat rose2 = new Cat("Rose",2, "Blue");
 * //        System.out.println(rose2);
 * //
 * //        System.out.println(rose1 == rose2);
 * //        System.out.println(rose1.equals(rose2));
 * //
 * //        Cat[] cats = new Cat[]{rose1, rose2};
 * //
 * //        Person alex = new Person("John",
 * //                "Doe",
 * //                Gender.MALE,
 * //                cats);
 * //
 * //        System.out.println(alex);
 *
 * //
 * //        AddressEx address = new AddressEx("" +
 * //                "foobar street",
 * //                "1234",
 * //                "Nowhere");
 * //
 * //        CarEx tesla = new CarEx(
 * //                "Tesla",
 * //                CarBrandEx.TESLA,
 * //                new BigDecimal("65000")
 * //        );
 * //
 * //        CarEx[] cars = {tesla};
 * //
 * //        PersonEx ales = new PersonEx("Alex",
 * //                22,
 * //                address,
 * //                cars
 * //        );
 * //
 * //        System.out.println(ales);
 */