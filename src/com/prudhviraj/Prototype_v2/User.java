package com.prudhviraj.Prototype_v2;

public class User {
    String firstName;
    String lastName;
    int age;
    String phoneNumber;
    public User(){

    }

    /**
     * This is the main method which helps to copy the objects and return the usr object
     * we call this method by using the object of this class.
     */
    public User prototype() {
        //here are we are crating the new object
        User protoUser = new User();
        //here we are coping the data here this refers to the object which is calling this method,
        //this always refers to the current object class
        protoUser.firstName = this.firstName;
        protoUser.lastName = this.lastName;
        protoUser.age = this.age;
        protoUser.phoneNumber = this.phoneNumber;
        return  protoUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
