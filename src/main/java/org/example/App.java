package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Country country1 = context.getBean("countryBean1", Country.class);
        Brand brand1 = context.getBean("brandBean1", Brand.class);
        Car car1 = context.getBean("carBean1", Car.class);
        Person person1 = context.getBean("personBean1", Person.class);

        System.out.println("Country 1 name: " + country1.getName() + "\n");
        System.out.println("Brand 1 name: " + brand1.getName() + "\n");
        System.out.println("Car 1 color: " + car1.getColor() + "\n");
        System.out.println("Person 1 full name: " + person1.getLastName() + " " + person1.getFirstName());
    }
}
