import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    DiceSet diceSet = new DiceSet();
    diceSet.roll();
    System.out.println(Arrays.toString(diceSet.getCurrent()));

    for (int i = 0; i < diceSet.getCurrent().length; i++) {
      while (diceSet.getCurrent(i) != 6) {
        diceSet.reroll(i);
      }
    }
    System.out.println(Arrays.toString(diceSet.getCurrent()));
  }
}
