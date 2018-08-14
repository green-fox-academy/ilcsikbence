import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type the range of the random number starting from 0");
    int rangeOfRandNum = scanner.nextInt();
    int randomNumber = 0 + (int) (Math.random() * rangeOfRandNum);
    System.out.println("Type in your guess");
    int guessNum = scanner.nextInt();
    for (int i = 0; i < 5; i++) {
      while (guessNum != randomNumber) {
        if (guessNum > randomNumber) {
          System.out.println("Too high." + " You have "+ (5 - i) +" lives left.");
          System.out.println("Type in your guess");
          guessNum = scanner.nextInt();
        }
        if (guessNum < randomNumber) {
          System.out.println("Too low. " + (5 - i) +" lives left.");
          System.out.println("Type in your guess");
          guessNum = scanner.nextInt();
        }
      }
      if (guessNum == randomNumber) {
        System.out.println("Congratulations! You won!");
      }
    }
  }
}
