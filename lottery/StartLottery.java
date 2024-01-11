package java_22.hw.lottery;

public class StartLottery {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int[] userNumber1 = Utils.getUserLotteryNumber();
        int[] userNumber2 = Utils.getUserLotteryNumber();
        int[] userNumber3 = Utils.getUserLotteryNumber();
        lottery.runLottery();
        int result1 = Utils.compareWinnerNumbers(lottery.getWinnerNumber(), userNumber1);
        int result2 = Utils.compareWinnerNumbers(lottery.getWinnerNumber(), userNumber2);
        int result3 = Utils.compareWinnerNumbers(lottery.getWinnerNumber(), userNumber3);
        System.out.println("User 1: " + result1 + " digits matched!");
        System.out.println("User 2: " + result2 + " digits matched!");
        System.out.println("User 3: " + result3 + " digits matched!");
    }
}
