public class UnaryTest {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Prev value: " + num++); // num = 5
        System.out.println("Post inc: " + num); // num = 6
        increment(num);
        System.out.println("\nUpdated value: " + num); // num = 6
        System.out.println("Post dec: " + num--); // num = 6
        decrement(num); // 5
        System.out.println("\nUpdated value: " + num); // num = 5
    }

    public static void increment(int num) {
        int numTemp = num++; // numTemp = 6
//        System.out.println("Prev value from method: " + num++); // 6
        System.out.println("Post inc  from method: " + numTemp); // 6
        System.out.println(num); // 7
    }

    public static void decrement(int num) {
        System.out.println("Prev value from method: " + num--); // 5
        System.out.println("Post dec  from method: " + num); // 4
    }
}
