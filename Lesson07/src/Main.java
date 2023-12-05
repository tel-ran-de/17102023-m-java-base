public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;
//        getSum(num2, num1);
//        getSum(5, 10);
//        int result = getReturnSum(num1, num2);
//        int result = getReturnSum(5, 10);
//        System.out.println("Return method: " + result);
//        System.out.println("Return method: " + getReturnSum(num1, num2));

        Cat cat = new Cat("Tom", 7);
        cat.getName();
        int catAge = cat.getAge();
        int pension = 15;
        System.out.println("Cat is " + catAge);
        System.out.println((pension - catAge) + " years to pension");

    }

    public static void getSum(int numOne, int numTwo) {
        System.out.println("Void method: " + (numOne + numTwo));
    }

    public static int getReturnSum(int a, int b) {
        return a + b;
    }
}