import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseNine {
  public static void main(String[] args) {
    Character[] charArray = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'c', 'o', 'o', 'l', '!'};
    ArrayList<Character> charList = new ArrayList<>(Arrays.asList(charArray));
    System.out.println(charList.stream()
      .map(c -> c.toString())
      .reduce((c1, c2) -> c1 + c2)
      .get());
  }
}