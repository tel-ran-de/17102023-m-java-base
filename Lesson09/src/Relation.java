public class Relation {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 5;

        System.out.println(num1 + " > " + num2 + " = " + (num1 > num2)); // false
        System.out.println(num1 + " < " + num2 + " = " + (num1 < num2)); // true
        System.out.println(num1 + " >= " + num2 + " = " + (num1 >= num2)); // false
        System.out.println(num1 + " <= " + num2 + " = " + (num1 <= num2)); // true
        System.out.println(num1 + " == " + num2 + " = " + (num1 == num2)); // false
        System.out.println(num1 + " != " + num2 + " = " + (num1 != num2)); // true

        System.out.println("\n");

        System.out.println(num1 + " > " + num3 + " = " + (num1 > num3)); // false
        System.out.println(num1 + " < " + num3 + " = " + (num1 < num3)); // false
        System.out.println(num1 + " >= " + num3 + " = " + (num1 >= num3)); // true
        System.out.println(num1 + " <= " + num3 + " = " + (num1 <= num3)); // true
        System.out.println(num1 + " == " + num3 + " = " + (num1 == num3)); // true
        System.out.println(num1 + " != " + num3 + " = " + (num1 != num3)); // false
    }
}
