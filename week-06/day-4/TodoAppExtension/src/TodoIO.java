import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TodoIO {
  static int sum = 0;
  static Path pathDefaultText = Paths.get("default_text.txt");
  static Path pathOfFile = Paths.get("tasks.txt");

  static void printDefault() {
    try {
      List<String> lines = Files.readAllLines(pathDefaultText);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }
    } catch (Exception ex) {
      System.out.println("default_text.txt was not found");
    }
  }

  static void readTasks() {
    try {
      List<String> lines = Files.readAllLines(pathOfFile);
      for (int i = 0; i < lines.size(); i++) {
        TodoLogic.tasks.add(new Todo(lines.get(i).split(" ")[0], Boolean.valueOf(lines.get(i).split(" ")[1])));
      }

      for (int i = 0; i < TodoLogic.tasks.size(); i++) {
        if (TodoLogic.tasks.get(i).equals("")) {
          TodoLogic.tasks.remove(i);
        }
      }

    } catch (IOException e) {
      System.out.println("tasks.txt was not found");
    }
  }

  static void readFile() {
    List<Todo> tempList = new ArrayList<>();
    for (int i = 0; i < TodoLogic.tasks.size(); i++) {
      if (!TodoLogic.tasks.get(i).task.equals("")) {
        tempList.add(TodoLogic.tasks.get(i));
      }
    }

    for (int j = 0; j < tempList.size(); j++) {
      System.out.println((sum += 1) + tempList.get(j).toString());
    }
  }

  static void writeFile() {
    try {
      List<String> lines2 = new ArrayList<>();
      for (int i = 0; i < TodoLogic.tasks.size(); i++) {
        lines2.add(TodoLogic.tasks.get(i).task + " " + TodoLogic.tasks.get(i).isDone);
      }
      Files.write(pathOfFile, lines2);
    } catch (Exception ex) {
      System.out.println("Unable to write the file.");
    }
  }

  static void completeTask(int ID) {
    try {
      List<String> lines2 = new ArrayList<>();

      for (int i = 0; i < TodoLogic.tasks.size(); i++) {
        lines2.add(TodoLogic.tasks.get(i).task + " " + TodoLogic.tasks.get(i).isDone);
      }

      TodoLogic.tasks.get(ID - 1).setDone();
      lines2.set(ID - 1, TodoLogic.tasks.get(ID - 1).task + " " + TodoLogic.tasks.get(ID - 1).isDone);
      Files.write(pathOfFile, lines2);

    } catch (Exception ex) {
      System.out.println("Unable to update the file.");
    }
  }

  static void removeTask(int ID) {
    try {
      List<String> lines2 = new ArrayList<>();

      for (int i = 0; i < TodoLogic.tasks.size(); i++) {
        lines2.add(TodoLogic.tasks.get(i).task + " " + TodoLogic.tasks.get(i).isDone);
      }

      lines2.get(ID).split(" ")[0] = "";

      Files.write(pathOfFile, lines2);

    } catch (Exception ex) {
      System.out.println("Unable to remove the file.");
    }
  }
}