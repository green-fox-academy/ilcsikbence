import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.rmi.server.ExportException;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of the lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    try {
      Path filePath = Paths.get("C:/greenfox/ilcsikbence/week-03/day-2/src/my-file.txt");
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines);
    } catch (Exception ex) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}