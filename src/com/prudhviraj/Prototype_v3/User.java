package com.prudhviraj.Prototype_v3;

/**
 * here we are implementing the prototype so that it has to implement the clone method
 * As we are using the generic type class in prototype we have to mention the for which data type this clone method should implement
 * the clone method
 */
public class User implements Prototype<User>{ //
    String name;
    int age;
    String number;

    /**
     * here we are using default constructor because we have overridden the constructor
     * so client can have permission to create on object without passing parameter into the constructor
     */
    public User () {}

    /**
     * Here we are using the parameterized constructor which is use in the clone method which helps us clone the object
     */
    public User(User user){
        this.name = user.name;
        this.age = user.age;
        this.number = user.number;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getNumber () {
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    @Override
    public String toString () {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                '}';
    }

    /** Note
     * <------------------------------------------------------------------------->
     * here we are implementing the actual clone method
     *  in side the clone method we are calling the parametrised  constructor
     * @return the User object by calling this, This means the object which is calling 
     * </------------------------------------------------------------------------->
     */
    @Override
    public User clone () {
        return new User (this);
    }
}
