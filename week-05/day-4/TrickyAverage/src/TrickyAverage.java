import java.util.ArrayList;

public class TrickyAverage {
  /**
   * Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
   * and returns the average of the smallest odd and largest even.
   * - use only basic control flow statements, like 'for', 'if', etc.
   * - do not use built-in methods like 'filter', 'forEach', 'map', etc.
   * - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
   * <p>
   * Example cases:
   * [1, 2, 3] -> should return 1.5
   * [3, 4, 5, 6] -> should return 4.5
   * [5, 2, 8, -1] -> should return 3.5
   */

  public double getTrickyAvg(int numbers[]) {

    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = 0; j < numbers.length - 1; j++) {
        if (numbers[j] > numbers[j + 1]) {
          int temp = numbers[j + 1];
          numbers[j + 1] = numbers[j];
          numbers[j] = temp;
        }
      }
    }

    ArrayList<Integer> evenNums = new ArrayList<>();
    ArrayList<Integer> oddNums = new ArrayList<>();

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 1) {
        oddNums.add(numbers[i]);
      }
    }

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        evenNums.add(numbers[i]);
      }
    }

    double biggestNumber = oddNums.get(0);
    double smallestNumber = evenNums.get(evenNums.size() - 1);

    double avg = (smallestNumber + biggestNumber) / 2;

    return avg;
  }
}