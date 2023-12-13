import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter a day number:");
//        int day = sc.nextInt();
        String dayString;
        EnumSwitch.DayOfWeek d = EnumSwitch.DayOfWeek.SUNDAY;
        switch (d) {
            case MONDAY:
                dayString = "Monday";
                break;
            case TUESDAY:
                dayString = "Tuesday";
                break;
            case WEDNESDAY:
                dayString = "Wednesday";
                break;
            case THURSDAY:
                dayString = "Thursday";
                break;
            case FRIDAY:
                dayString = "Friday";
                break;
            case SATURDAY:
                dayString = "Saturday";
                break;
            case SUNDAY:
                dayString = "Sunday";
                break;
            default:
                dayString = "Not defined";
        }

        System.out.println(dayString);
    }
}