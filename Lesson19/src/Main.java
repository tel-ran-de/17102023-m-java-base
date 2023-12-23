public class Main {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("Java");

//        ==
        System.out.println("str1 == str2 - " + (str1 == str2));
        System.out.println("str3 == str4 - " + (str3 == str4));
//        System.out.println("str1 == str3 - " + (str1 == str3));

//        equals
        System.out.println("str1 equals str2 - " + str1.equals(str2));
        System.out.println("str3 equals str4 - " + str3.equals(str4));
        System.out.println("str1 equals str3 - " + str1.equals(str3));

//       Car bmw = new Car("bmw", 2002);
//       Car audi = new Car("audi", 2010);
//       System.out.println(bmw.toString());

    }
}