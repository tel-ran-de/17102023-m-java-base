public class StringBuilderTest {
    public static void main(String[] args) {
        System.out.println("SB1");
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

//        System.out.println("SB2");
//        StringBuilder sb2 = new StringBuilder(100);
//        System.out.println(sb2.capacity());
//        System.out.println(sb2.length());
//
//        System.out.println("SB3");
//        StringBuilder sb3 = new StringBuilder("hellohello");
//        System.out.println(sb3.capacity());
//        System.out.println(sb3.length());
//
//        System.out.println("SB4");
//        StringBuilder sb4 = new StringBuilder("StringBuilder based on String");
//        System.out.println(sb4.capacity());
//        System.out.println(sb4.length());

        System.out.println("Append");
        sb1.append("StartaUniversity");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1);

        System.out.println("Reverse");
        sb1.reverse();
        System.out.println(sb1);

    }
}
