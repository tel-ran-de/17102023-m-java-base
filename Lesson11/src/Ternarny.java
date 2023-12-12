public class Ternarny {
    public static void main(String[] args) {
        int num = -10;
        boolean isPositive;
        boolean isPositive1;

        if (num >= 0) {
            isPositive = true;
        } else {
            isPositive = false;
        }

        isPositive1 = num >= 0 && num < 20 ? true : false;

        System.out.println(isPositive);
        System.out.println(isPositive1);
    }
}
