public class ExerciseFive {
  public static void main(String[] args) {
    String hasAnUpperCase = "this String Has Uppercase Letters";
    hasAnUpperCase
        .chars()
        .filter(x -> Character.isUpperCase(x))
        .mapToObj(x -> (char) x)
        .forEach(System.out::println);
  }
}