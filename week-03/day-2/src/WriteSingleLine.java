import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"

    ArrayList<String> editFile = new ArrayList<>();
    editFile.add("Bence Ilcsik");
    try {
      Path filePath = Paths.get("C:/greenfox/ilcsikbence/week-03/day-2/src/my-file.txt");
      Files.write(filePath, editFile);
    } catch (Exception exception){
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}