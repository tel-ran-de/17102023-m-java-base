public class Logic {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int num3 = 10;

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("Max val: " + num1);
        }
        else if ((num2 > num3) && (num2 > num1)) {
            System.out.println("Max val: " + num2);
        }
        else
        {
            System.out.println("Max val: " + num3);
        }
    }
}
