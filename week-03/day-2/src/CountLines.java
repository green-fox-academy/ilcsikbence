import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    String fileName = "my-file.txt";
    numberOfLines(fileName);
  }
  public static void numberOfLines (String fileName) {
    try {
      Path filePath = Paths.get("C:/greenfox/ilcsikbence/week-03/day-2/src/" + fileName);
      List<String> numberLines = Files.readAllLines(filePath);
      System.out.println(numberLines.size());
    } catch (Exception exception){
      System.out.println(0);
    }
  }
}
