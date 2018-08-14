import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.

    Path filePath = Paths.get("log.txt");
    for (int i = 0; i < ipAddress(filePath).length; i++) {
      System.out.println(ipAddress(filePath)[i]);
    }


  }

  public static Object[] ipAddress (Path filePath) {
    ArrayList<String> arrayList = new ArrayList<>();
    try {
      Files.readAllLines(filePath).addAll(arrayList);
      return arrayList.toArray();
    } catch (Exception ex) {
      System.out.println("error");
    }
    return arrayList.toArray();
  }
}
