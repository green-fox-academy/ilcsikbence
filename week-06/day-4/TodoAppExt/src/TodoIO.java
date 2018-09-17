import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class TodoIO {
  static Path pathDefaultText = Paths.get("default_text.txt");
  static Path todosPath = Paths.get("todos.txt");
  static Path IDsPath = Paths.get("IDs.txt");
  static List<String> todosLines = new ArrayList<>();
  static List<Todo> todosList = new ArrayList<>();
  static List<String> IDsLines = new ArrayList<>();
  static List<Integer> IDsList = new ArrayList<>();

  public static void printDefault() {
    try {
      List<String> lines = Files.readAllLines(pathDefaultText);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }
    } catch (Exception ex) {
      System.out.println("default_text.txt was not found");
    }
  }

  public static void readFile() {
    try {
      todosLines = Files.readAllLines(todosPath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    try {
      IDsLines = Files.readAllLines(IDsPath);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void listFiles() {
    int sum = 0;
    for (int i = 0; i < todosLines.size(); i++) {
      System.out.println((sum += 1) + " - [" + todosLines.get(i).split(" ")[2] + "]  " + todosLines.get(i).split(" ")[1]);
    }
  }

  public static void overwriteFile() {
    List<String> todosLinesToWrite = new ArrayList<>();

    for (int i = 0; i < todosList.size(); i++) {
      todosLinesToWrite.add(todosList.get(i).toString());
    }

    try {
      Files.write(todosPath, todosLinesToWrite);
    } catch (IOException e) {
      e.printStackTrace();
    }

    List<String> IDsToWrite = new ArrayList<>();

    for (int i = 0; i < IDsLines.size(); i++) {
      IDsToWrite.add(IDsList.get(i).toString());
    }

    try {
      Files.write(IDsPath, IDsToWrite, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
