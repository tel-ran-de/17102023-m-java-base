package Practice03;

public class Dog {
    private String name;
    private String bread;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getBread() {
        return this.bread;
    }

    public void setAge(Integer age) {
        if (age <= 20 && age >= 0) {
            this.age = age;
        } else {
            System.out.println("Incorrect age");
        }
    }

    public Integer getAge() {
        return this.age;
    }

    public void bark() {
        System.out.println("wow-wow-wow");
    }
}
