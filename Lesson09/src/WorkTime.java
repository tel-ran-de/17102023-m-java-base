public class WorkTime {
    public static void main(String[] args) {
        int start = 9;
        int offTime = 14;
        int stop = 18;
        int workHours = 8;
        int currenTime = 9;

        if (currenTime == start) {
            System.out.println("Working time: " + workHours);
        } else if (currenTime == offTime) {
            System.out.println("It's time to rest! Working time: " + (stop - offTime - 1));
        } else if (currenTime == stop) {
            System.out.println("It's time to go home. Working time: " + (stop - currenTime));
        } else {
            System.out.println("Working time: " + (stop - currenTime - 1));
        }

    }
}
