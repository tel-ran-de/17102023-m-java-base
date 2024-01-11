package java_22.hw.lottery;

public class Lottery {
    int range = 50;   // Assume selecting integers between 1 and range.
    int lucky;        // Holds a lucky number candidate.
    int luckyCount;   // Holds count of lucky numbers in a set.
    int[] winnerNumber = new int[Constants.COUNT_SET_SIZE]; // Lucky numbers for the set of 5.

    public void runLottery() {
            luckyCount = 1; // Count of numbers found in the current set
            while (luckyCount <= Constants.COUNT_SET_SIZE) {
                lucky = (int) (1 + Math.random() * ((range - 1) + 1));  // Generate a lucky number between 1 and 50 and add 1:
                switch (luckyCount) {
                    case 1 -> {
                        winnerNumber[0] = lucky;
                        luckyCount++;
                    }
                    case 2 -> {
                        if (lucky != winnerNumber[0]) {
                            winnerNumber[1] = lucky;
                            luckyCount++;
                        }
                    }
                    case 3 -> {
                        if (lucky != winnerNumber[0] && lucky != winnerNumber[1]) {
                            winnerNumber[3] = lucky;
                            luckyCount++;
                        }
                    }
                    case 4 -> {
                        if (lucky != winnerNumber[0] && lucky != winnerNumber[1] && lucky != winnerNumber[2]) {
                            winnerNumber[3] = lucky;
                            luckyCount++;
                        }
                    }
                    case 5 -> {
                        if (lucky != winnerNumber[0] && lucky != winnerNumber[1] && lucky != winnerNumber[2] && lucky != winnerNumber[3]) {
                            winnerNumber[4] = lucky;
                            luckyCount++;
                        }
                    }
                }
            }
        }

    public int[] getWinnerNumber() {
        return winnerNumber;
    }
}
