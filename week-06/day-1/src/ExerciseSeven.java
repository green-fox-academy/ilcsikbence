import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseSeven {
  public static void main(String[] args) {
    String frequencyOfChar = "This is a test to count characters";
    List<String> frequencyOfCharList = Arrays.asList(frequencyOfChar.split(""));
    System.out.println(frequencyOfCharList.stream()
        .collect(Collectors.groupingBy(x -> x, Collectors.counting())));
  }
}