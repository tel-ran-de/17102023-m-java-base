import java.util.List;

class MainClass {
    public static void main(String[] args) {
        // Boolean
        boolean isBlack = false;

        /* Numbers */
        byte b = 127;
        short s = 23454;
        int i = 1_000_000_000;
        long l = 1_000_000_000;

        // Float, Double
        float f = 1.234f;
        double d = 1.234;

        // Char
        char ch = 'q';
        char ch2 = '\uffff';
        // System.out.println(ch2);

        // String
//        String str = "Hello \"world";

        int x1  = 5;
        float x2 = 2;
        float res = x1 / x2;
        int res2 = x1 % 2;
//        System.out.println(res);
//        System.out.println(res2);

        int x3 = 7;
        int x4 = 4;
        int multRes = x3 * x4;
        int addRes = x3 + x4;
        int powRes = x3 * x3 * x3;
//        System.out.println(multRes);
//        System.out.println(addRes);
//        System.out.println(powRes);

        int a = 7;
        float c = 7.0f;
//        System.out.println(a > c);

//        byte ->  short -> int -> long
//        float -> double
//        long l1 = 1234;
//        int i2 = (int)l1;
//        int i3 = 12;
//        long l3 = i3;
        int i2 = 127;
        byte b2 = (byte) i2;
        System.out.println(i2);
        System.out.println(b2);
        Integer i3 = new Integer(123);
        System.out.println(i2 > i3);

    }
}