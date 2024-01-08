package org.example;

import java.util.Objects;

public class Car {
    private Integer doors;
    private String name;
    private Double engine;
    private Integer year;

    public Car() {
        this.year = 2024;
    }
//    public Car()

    public Integer getDoors() {
        return this.doors;
    }

    public String getName() {
        return this.name;
    }

    public Double getEngine() {
        return this.engine;
    }

    public Integer getYear() {
        return this.year++;
    }

    public void setDoors(Integer doors) {
        if (doors < 3 || doors > 5) {
            System.out.println("Your enter incorrect value");
        } else {
            this.doors = doors;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }
}
