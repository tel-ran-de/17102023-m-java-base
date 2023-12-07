public class UnaryPred {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Current value: " + num); // 5
        System.out.println("Pred inc: " + ++num); // 6
        System.out.println("Updated value: " + num); // 6
        System.out.println("Pred dec: " + --num); // 5
    }
}
/*
Pred inc/dec
num = 5 -> ++num
1) num = num + 1 // 6
2) print num // 6

Post inc/dec
num = 5 -> num++
1) num // 5
2) print num // 5
3) print num // 6
 */