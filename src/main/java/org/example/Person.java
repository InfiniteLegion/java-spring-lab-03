package org.example;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String firstName;
    private String lastName;
    private Car car;

    public Person() {}

    public Person(String firstName, String lastName, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("Class user - setFirstName");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("Class user - setLastName");
        this.lastName = lastName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        System.out.println("Class user - setCar");
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", car=" + car.toString() +
                '}';
    }
}
