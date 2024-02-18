package com.prudhviraj.Prototype_v1;
/**
 * The main moto of the design pattern is to make copy of the same object for the multiple times
 */
public class Client {
    public static void main(String[] args) {

        User user = new User();
        user.setFirstName("Bavigadda");
        user.setLastName("prudhviraj");
        user.setAge(23);
        user.setPhoneNumber("123456789");


        User user1 = new User();
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setAge(user.getAge());
        user1.setPhoneNumber(user.getPhoneNumber());

        System.out.println(user);
        System.out.println(user1);
        /**
         * here the issue with this version is
         * 1. we have to manually copy the object details into another object
         * 2. we have to take care of the object parameters while coping into the another object
         * 3. It is long time taking process
         * 4. code is note reusable
         * 5. chances to get more errors
         *
         * Thats why we are moving into the version 2
         */






    }
}
