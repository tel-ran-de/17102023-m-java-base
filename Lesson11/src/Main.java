public class Main {
    public static void main(String[] args) {
        int num = 10;
//        if
//        if (num != 15) {
//            System.out.println(num + " not equals 15");
//        }
//        if (num == 15) {
//            System.out.println(num + " equals 15");
//        }
//        System.out.println("I'm not in equals");

//        if - else
//        if (num < 15) {
//            System.out.println(num + " is smaller than 15");
//        } else {
//            System.out.println(num + " is greater than 15");
//        }

//        nested-if
//        if (num == 10) {
//            if (num < 15) {
//                System.out.println(num + " is smaller than 15");
//
//                if (num < 12) {
//                    System.out.println(num + " is smaller than 12");
//                } else {
//                    System.out.println(num + " is greater than 12");
//                }
//            }
//        }

//        if-else-if ladder
//        int n = 100;
//        if (n == 10) {
//            System.out.println(n + " is 10");
//        } else if (n == 15) {
//            System.out.println(n + " is 15");
//        } else if (n == 20) {
//            System.out.println(n + " is 20");
//        } else {
//            System.out.println(n + " is not present");
//        }

//        return
        boolean t = false;
        System.out.println("Before the return instruction");
        if (t) {
            System.out.println(t + " is true");
            return;
        } else {
//            System.exit(0); -> return;
        }
//        return;
        System.out.println("This won't execute");
    }
}