import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    String filename1 = "my-file.txt";
    String filename2 = "newfile.txt";

    System.out.println(copyFiles(filename1, filename2));
  }

  public static boolean copyFiles (String filename1, String filename2) {
    boolean isTrue = true;

    try {
      Path filePath = Paths.get("C:/greenfox/ilcsikbence/week-03/day-2/src/" + filename1);
      Path filePath2 = Paths.get("C:/greenfox/ilcsikbence/week-03/day-2/src/" + filename2);
      Files.copy(filePath, filePath2);
    } catch (Exception ex){
      isTrue = false;
    }
    return isTrue;
  }
}
