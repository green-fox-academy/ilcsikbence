import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseTwo {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(numbers.stream()
        .filter(x -> x % 2 != 0)
        .mapToInt(x -> x)
        .average()
        .getAsDouble());
  }
}