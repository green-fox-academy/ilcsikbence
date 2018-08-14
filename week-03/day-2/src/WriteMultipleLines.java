import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.

    String fileLocation = "C:/greenfox/ilcsikbence/week-03/day-2/src/my-file.txt";
    String word = "Apple";
    int number = 5;
    writeToFile(fileLocation, word, number);

  }

  public static void writeToFile (String fileLocation, String word, int number){
    ArrayList<String> newArray = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      newArray.add(word);
    }
    try {
      Path filePath = Paths.get(fileLocation);
      Files.write(filePath, newArray);
      System.out.println("File was successfully overwritten.");
    } catch (Exception ex){
      System.out.println("Couldn't write file");
    }
  }
}
