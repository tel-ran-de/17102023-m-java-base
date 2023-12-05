public class MainMathRandom {
    public static void main(String[] args) {
        double rand = Math.random();
//        System.out.println(rand);
        int min = 500;
        int max = 1000;
        int res = (int)(rand * (max - min + 1)) + min;
        System.out.println(res);
        System.out.println(rand);
        System.out.println((int)rand);
        System.out.println(rand * (max - min + 1));
        System.out.println((int)(rand * (max - min + 1)));
    }
}
