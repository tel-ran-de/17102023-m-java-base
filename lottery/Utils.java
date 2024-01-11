package java_22.hw.lottery;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    public static int compareWinnerNumbers(int[] lotteryNumber, int[] userNumber) {
        int count = 0;
        Arrays.sort(lotteryNumber);
        Arrays.sort(userNumber);
        for (int i = 0; i < Constants.COUNT_SET_SIZE; i++) {
            if(lotteryNumber[i] == userNumber[i]) {
                count++;
            }
        }
        return count;
    }

    public static int[] getUserLotteryNumber() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[Constants.COUNT_SET_SIZE];
        for (int i = 0; i < Constants.COUNT_SET_SIZE; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
