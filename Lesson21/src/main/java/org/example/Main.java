package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car();
        System.out.println("Current year is " + car1.getYear());
        System.out.println("Next year is " + car1.getYear());
        System.out.println("Car name before int " + car1.getName());
        System.out.println("Car doors before int " + car1.getDoors());
        System.out.println("Car engine before int " + car1.getEngine());
//        car1.setName("BMW X3");
//        car1.setDoors(5);
//        car1.setEngine(5.5);
        System.out.println("User input:");
//        System.out.println("Enter a car name:");
//        String name = sc.nextLine();
//        car1.setName(name);
        System.out.println("Enter count doors:");
        Integer doors = sc.nextInt();
//        car1.doors = doors;
        car1.setDoors(doors);
//        System.out.println("Enter a car engine:");
//        Double engine = sc.nextDouble();
//        car1.setEngine(engine);
        System.out.println("Car name " + car1.getName());
        System.out.println("Car doors " + car1.getDoors());
        System.out.println("Car engine " + car1.getEngine());
    }
}