import java.util.stream.Collectors;

public class ExerciseSeven {
  public static void main(String[] args) {
    String frequencyOfChar = "This is a test to count characters";

    System.out.println(frequencyOfChar.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
  }
}