package com.prudhviraj.Prototype_v2;

/**
 * Here the version 2
 * 1. here we are not copying the entire data by manually
 * 2. we are calling the prototupe method which helps to makes and build the new object which makes deep copy of the object
 * 3. the build method we return the new object of the new user with the same data
 */
public class Client {
    public static void main ( String[] args ) {
        User user = new User ();
        user.setFirstName ( "Bavigadda" );
        user.setLastName ( "prudhviraj" );
        user.setAge ( 23 );
        user.setPhoneNumber ( "12345" );

        User newUser = user.prototype ();

        System.out.println ( user );
        System.out.println ( newUser );

        /**
         * The issue with this version 2
         * 1. it will create a problem when one object have same all attributes of parent object but the child object is  having some extra attributes
         * 2. like when we have to differentiate the users like premium users lke( silver user. gold user, diamond user).
         * 3. then this method won't work when there is a parent child relation between the two objects when the child object have difference in attributes,
         */
    }
}
