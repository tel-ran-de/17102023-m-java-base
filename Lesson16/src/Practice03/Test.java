package Practice03;

public class Test {
    public static void main(String[] args) {
        Dog alpha = new Dog();
        alpha.setName("Alpha");
        alpha.setBread("Dog");
        alpha.setAge(5);

        Dog tuzik = alpha;
        tuzik.setName("Tuzik");

        System.out.println(alpha.getName());
        System.out.println(alpha.getAge());
        System.out.println(alpha.getBread());
        alpha.bark();

        System.out.println(tuzik.getName());
        System.out.println(tuzik.getAge());
        System.out.println(tuzik.getBread());
    }
}
