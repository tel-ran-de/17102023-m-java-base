public class Main {
    public static void main(String[] args) {
        String str = "Hello";
//        System.out.println(str.length());
        String str1 = "Hello world!";
//        System.out.println(str1.length());
//
//        System.out.println(str1.charAt(0));
//        System.out.println(str1.charAt(str1.length() - 1));
//        System.out.println(str1.charAt(100));
//        System.out.println(str1.substring(1));
//        System.out.println(str1.substring(1, 5));
//        System.out.println(str1.substring(1, 5) + " " + str1.substring(7));

//        System.out.println(str1 + " -> " + str1.toLowerCase());
//        System.out.println(str1 + " -> " + str1.toUpperCase());

//        int number1 = 'A';
//        System.out.println(number1);
//        int number2 = Integer.valueOf('A');
//        System.out.println(number2);
//        int number3 = Character.getNumericValue('A');
//        System.out.println(number3);

//        System.out.print("Input a num: ");
//        System.out.println("Input a num: ");
        System.out.printf("Hello, %s!", "John"); // форматирование строки
        System.out.println(String.format("\nHello, %s!", "John"));

        System.out.println(str1.replace('o', 'y')); // заменяет все вхождения 'o' на 'y'

        System.out.println(str1.indexOf("world"));  // индекс с которого начинается слово
        System.out.println(str1.contains("world")); // true если слово есть в строке и false, если нет

        System.out.println(str1.indexOf("buy"));
        System.out.println(str1.contains("buy"));






//      Car - class
//      car1 - variable
//      new Car() - create object
//        Car car1 = new Car();
//        car1.setWheels(4);
//        car1.setDoors(2);
//
//        Car car2 = new Car();
//        car2.setWheels(6);
//        car2.setDoors(4);
    }
}