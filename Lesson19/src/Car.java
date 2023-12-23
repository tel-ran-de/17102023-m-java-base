public class Car {
    private String name;
    private Integer year;

    public Car(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.year;
    }
}
