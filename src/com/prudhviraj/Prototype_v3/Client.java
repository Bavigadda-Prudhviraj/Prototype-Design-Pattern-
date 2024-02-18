package com.prudhviraj.Prototype_v3;


/**
 * Here the final version of the Proto-type what we are doing here
 * 1. we are creating an interface and adding the one clone abstract method.
 * 2. why functional interface means
 *      1. when a childed class object need to copy child object then, as we are implementing cone method, so we can directly call that method to copy of object
 *      2. No need to worry about the parent and child object when cloning because both are implementing the prototype interface
 *      3. Here we are playing with the cone method and constructors.
 *      4. we call clone method internally calls constructor an in the child constructor we are calling the parent constructor using "super()" method
 */

public class Client {
    public static void main ( String[] args ) {
        User user = new User ();
        user.setName ( "Raj" );
        user.setAge ( 23 );
        user.setNumber ( "123456789" );

        User user1 = user.clone ();
        System.out.println (user);
        System.out.println (user1);



        PremiumUser premiumUser = new PremiumUser ();
        premiumUser.setName ( "PrudhviRaj" );
        premiumUser.setAge ( 23 );
        premiumUser.setNumber ( "123456789" );
        premiumUser.setUserType ( "Gold User" );
        premiumUser.setNoOfMonths ( 6 );

        PremiumUser premiumUser1 = premiumUser.clone ();
        System.out.println (premiumUser);
        System.out.println (premiumUser1);

        User premiumUser2 = new PremiumUser ();
        premiumUser2 = premiumUser1.clone ();
        System.out.println (premiumUser2);

        //System.out.println (premiumUser.compareTo(premiumUser2));



    }
}
