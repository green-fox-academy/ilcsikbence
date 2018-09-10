import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseSix {
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    cities.stream()
        .filter(x -> x.startsWith("A"))
        .filter(x -> x.endsWith("I"))
        .forEach(System.out::print);
  }
}