import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        if ((str.length() % 2 != 0) || (str1.length() % 2 != 0)) {
            System.out.println("Your entered wrong words");
        }
        else {
            System.out.println(str);
        }
    }
}