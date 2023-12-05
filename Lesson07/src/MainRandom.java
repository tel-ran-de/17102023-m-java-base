import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int upperRound = 11;
        int intRandom = random.nextInt(upperRound);
        System.out.println(intRandom);
        float floatRandom = random.nextFloat();
        System.out.println(floatRandom);
        double doubleRandom = random.nextDouble();
        System.out.println(doubleRandom);
    }
}
